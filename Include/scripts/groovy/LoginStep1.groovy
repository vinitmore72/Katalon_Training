import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable

import cucumber.api.java.en.Given
import cucumber.api.java.en.When
import cucumber.api.java.en.Then
import cucumber.api.java.en.And

class LoginStep {

	@Given("user is on login page")
	public void user_is_on_login_page() {
		println "I am inside Given"

		WebUI.openBrowser('')
		WebUI.navigateToUrl(GlobalVariable.url)
	}

	@When("user enters username and password")
	public void user_enters_username_and_password() {
		println "I am inside When"

		WebUI.click(findTestObject('Login_register/Page_DEMOQA/Page_DEMOQA/h5_Book Store Application'))
		WebUI.click(findTestObject('Login_register/Page_DEMOQA/span_Login'))
	}

	@And("clicks on login button")
	public void clicks_on_login_button() {
		println "I am inside And"

		WebUI.setText(
				findTestObject('Login_register/Page_DEMOQA/input_UserName_userName'),
				GlobalVariable.username
				)

		WebUI.setMaskedText(
				findTestObject('Login_register/Page_DEMOQA/input_Password_password'),
				GlobalVariable.password
				)
	}

	@Then("user is navigated to the home page")
	public void user_is_navigated_to_the_home_page() {
		println "I am inside Then"

		WebUI.click(findTestObject('Login_register/Page_DEMOQA/button_Login'))
		WebUI.closeBrowser()
	}
}
