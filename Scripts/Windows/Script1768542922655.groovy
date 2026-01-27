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
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/browser-windows')

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('Object Repository/Windows/Page_DEMOQA/button_New Tab'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.switchToWindowTitle('')

WebUI.verifyTextPresent('This is a sample page', false)

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/browser-windows')

WebUI.click(findTestObject('Object Repository/Windows/Page_DEMOQA/button_New Window'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(5)

WebUI.switchToWindowTitle('')

WebUI.closeBrowser()

WebUI.openBrowser('')

WebUI.navigateToUrl('https://demoqa.com/browser-windows')

WebUI.click(findTestObject('Object Repository/Windows/Page_DEMOQA/button_New Window Message'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.delay(2)

WebUI.switchToWindowIndex(1)

WebUI.delay(5)

WebUI.maximizeWindow()

WebUI.verifyTextPresent('Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.', 
    false)

WebUI.verifyElementText(findTestObject(null), 'Knowledge increases by sharing but not by saving. Please share this website with your friends and in your organization.')

WebUI.closeBrowser()

