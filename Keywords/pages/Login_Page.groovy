package pages

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import webCode.Utilitarios
import internal.GlobalVariable

public class Login_Page{

	Utilitarios webCode = new Utilitarios()
	TestObject userName =  webCode.Xpath("//*[@id='username']");
	TestObject password =  webCode.Xpath("//*[@id='password']");
	TestObject loginBtn =  webCode.Xpath("//*[@id='login']/button/i");
	TestObject message =  webCode.Xpath("//*[@id='flash']");
	String loginUrl = "http://the-internet.herokuapp.com/login";
	String invalid_password = "Your password is invalid!"
	String invalid_userName = "Your username is invalid!"
	String success_login = "You logged into a secure area!"

	public Login_Page() {
		WebUI.navigateToUrl(loginUrl)
	}

	public void setUserName(String text) {
		WebUI.setText(userName, text)
	}

	public void setPassword(String text) {
		WebUI.setText(password, text)
	}

	public void clickBtnLogin() {
		WebUI.click(loginBtn)
	}

	public String getMessage() {
		return WebUI.getText(message)
	}
}
