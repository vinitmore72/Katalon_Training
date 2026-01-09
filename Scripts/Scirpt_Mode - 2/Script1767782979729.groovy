import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testng.keyword.TestNGBuiltinKeywords as TestNGKW
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.webui.keyword.builtin.NavigateToUrlKeyword as NavigateToUrlKeyword
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl(URRL)

WebUI.click(findTestObject('Object Repository/Script_Mode/Page_DEMOQA/span_Dynamic Properties'))

WebUI.waitForPageLoad(5)

WebUI.click(findTestObject('Object Repository/Script_Mode/Page_DEMOQA/span_Upload and Download'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.doubleClick(findTestObject('Object Repository/Script_Mode/Page_DEMOQA/li_Buttons'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Script_Mode/Page_DEMOQA/li_Buttons'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Script_Mode/Page_DEMOQA/button_Right Click Me'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Script_Mode/Page_DEMOQA/button_Double Click Me'))

WebUI.click(findTestObject('Object Repository/Script_Mode/Page_DEMOQA/span_Broken Links - Images'))

WebUI.click(findTestObject('Object Repository/Script_Mode/Page_DEMOQA/a_Click Here for Valid Link'))

WebUI.click(findTestObject('Object Repository/Script_Mode/Page_DEMOQA/a_Click Here for Broken Link'))

WebUI.closeBrowser()

