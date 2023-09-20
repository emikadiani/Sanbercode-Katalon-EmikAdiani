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

WebUI.openBrowser(GlobalVariable.baseUrl)

WebUI.setViewPortSize(GlobalVariable.viewportWidth, GlobalVariable.viewportHeight)

WebUI.waitForElementVisible(findTestObject('HomePage/h1_PRODUCT STORE'), 0)

WebUI.verifyElementVisible(findTestObject('HomePage/h1_PRODUCT STORE'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HomePage/menu_Sign up'))

WebUI.waitForElementVisible(findTestObject('SignUp-Page/h2_Sign up'), 0)

WebUI.verifyElementVisible(findTestObject('SignUp-Page/h2_Sign up'))

WebUI.click(findTestObject('SignUp-Page/btn_Sign up'))

WebUI.waitForAlert(4)

alertSignUp3 = WebUI.getAlertText()

println('alert text is: ' + alertSignUp3)

WebUI.verifyMatch(alertSignUp3, 'Please fill out Username and Password.', false)

WebUI.verifyAlertPresent(2)

WebUI.acceptAlert()

WebUI.closeBrowser()

