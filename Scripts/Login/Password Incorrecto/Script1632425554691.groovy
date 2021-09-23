import com.kms.katalon.core.util.KeywordUtil
import pages.Login_Page as Login_Page

Login_Page login_page = new Login_Page()

login_page.setUserName('tomsmith')

login_page.setPassword('123456')

login_page.clickBtnLogin()

if(login_page.getMessage().contains(login_page.invalid_password)) {
	KeywordUtil.markPassed("Test Case Passed" + login_page.invalid_password)
}else {
	KeywordUtil.markFailed("Test Case Failed" + login_page.invalid_userName)
}

