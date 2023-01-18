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
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows
import internal.GlobalVariable as GlobalVariable

WebUI.callTestCase(findTestCase('Basic Exchange Rate Test/UTILITIES/OPEN_BROWSER'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.mouseOver(findTestObject('Exchange/Page_martintestforpackage/Exchange-Rate_Dropdown'))

WebUI.waitForElementVisible(findTestObject('Exchange/Page_martintestforpackage/Exchange-Rate_Dropdown'), 0)

current_currency = WebUI.getAttribute(findTestObject('Page_martintestforpackage/input_current_currencyCode'), 'value')

println(current_currency)

WebUI.verifyOptionSelectedByValue(findTestObject('Exchange/Page_martintestforpackage/Exchange-Rate_Dropdown'), current_currency, 
    false, 0)

WebUI.delay(5)

WebUI.callTestCase(findTestCase('Basic Exchange Rate Test/UTILITIES/CLOSE_BROWSER'), [:], FailureHandling.STOP_ON_FAILURE)

