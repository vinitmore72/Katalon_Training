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

WebUI.navigateToUrl('https://demoqa.com/select-menu')

WebUI.maximizeWindow()

WebUI.click(findTestObject('PRACTICE9/Page_DEMOQA/div_Select Option'))

WebUI.click(findTestObject('PRACTICE9/Page_DEMOQA/div_Group 1, option 1'))

WebUI.delay(3)

WebUI.click(findTestObject('PRACTICE9/Page_DEMOQA/div_Select Title'))

WebUI.click(findTestObject('PRACTICE9/Page_DEMOQA/div_Mr'))

WebUI.click(findTestObject('PRACTICE9/Page_DEMOQA/div_Select Option'))

WebUI.delay(3, FailureHandling.CONTINUE_ON_FAILURE)

WebUI.scrollToElement(findTestObject('PRACTICE9/Page_DEMOQA/div_Red'), 0)

WebUI.click(findTestObject('PRACTICE9/Page_DEMOQA/div_Select Option'))

WebUI.delay(1)

WebUI.scrollToElement(findTestObject('PRACTICE9/Page_DEMOQA/select_RedBlueGreenYellowPurpleBlackWhiteVo_537a50'), 0)

WebUI.selectOptionByLabel(findTestObject('PRACTICE9/Page_DEMOQA/select_RedBlueGreenYellowPurpleBlackWhiteVo_537a50'), 'Red', 
    false)

