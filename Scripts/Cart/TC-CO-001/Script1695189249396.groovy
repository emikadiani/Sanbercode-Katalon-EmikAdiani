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

WebUI.callTestCase(findTestCase('Cart/block-addToCart'), [:], FailureHandling.CONTINUE_ON_FAILURE)

WebUI.click(findTestObject('HomePage/menu_Cart'))

WebUI.waitForElementVisible(findTestObject('Cart/4.General/h2_Products'), 0)

WebUI.verifyElementVisible(findTestObject('Cart/4.General/btn_Place Order'))

WebUI.click(findTestObject('Cart/4.General/btn_Place Order'))

WebUI.waitForElementVisible(findTestObject('Cart/3.Place-Order/div_Place order'), 0)

WebUI.verifyElementVisible(findTestObject('Cart/3.Place-Order/div_Place order'))

WebUI.setText(findTestObject('Cart/3.Place-Order/txt_Name'), findTestData('DataOrder/DataOrder-Excel').getValue(1, 1))

WebUI.setText(findTestObject('Cart/3.Place-Order/txt_country'), findTestData('DataOrder/DataOrder-Excel').getValue(2, 1))

WebUI.setText(findTestObject('Cart/3.Place-Order/txt_city'), findTestData('DataOrder/DataOrder-Excel').getValue(3, 1))

WebUI.setText(findTestObject('Cart/3.Place-Order/txt_card'), findTestData('DataOrder/DataOrder-Excel').getValue(4, 1))

WebUI.setText(findTestObject('Cart/3.Place-Order/txt_month'), findTestData('DataOrder/DataOrder-Excel').getValue(5, 1))

WebUI.setText(findTestObject('Cart/3.Place-Order/txt_year'), findTestData('DataOrder/DataOrder-Excel').getValue(6, 1))

WebUI.scrollToElement(findTestObject('Cart/3.Place-Order/btn_Purchase'), 0)

WebUI.verifyElementVisible(findTestObject('Cart/3.Place-Order/btn_Purchase'))

WebUI.click(findTestObject('Cart/3.Place-Order/btn_Purchase'))

