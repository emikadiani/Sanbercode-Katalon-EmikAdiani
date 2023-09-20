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

WebUI.waitForElementVisible(findTestObject('HomePage/menu_Log in'), 0)

WebUI.verifyElementVisible(findTestObject('HomePage/menu_Log in'), FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HomePage/menu_Log in'))

WebUI.waitForElementVisible(findTestObject('Login-Page/h2_Log in'), 0)

WebUI.verifyElementVisible(findTestObject('Login-Page/h2_Log in'))

WebUI.setText(findTestObject('Login-Page/txt_login_Username'), GlobalVariable.validUsername)

WebUI.setText(findTestObject('Login-Page/txt_login_Password'), GlobalVariable.validPassword)

WebUI.click(findTestObject('Login-Page/btn_Log in'))

WebUI.verifyElementVisible(findTestObject('HomePage/menu_Welcome'))

WebUI.verifyTextPresent(GlobalVariable.validUsername, false)

