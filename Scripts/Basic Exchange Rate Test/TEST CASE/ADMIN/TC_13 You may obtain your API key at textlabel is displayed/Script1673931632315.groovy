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

WebUI.callTestCase(findTestCase('Basic Exchange Rate Test/UTILITIES/OPEN_BROWSER_ADMIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.callTestCase(findTestCase('Basic Exchange Rate Test/UTILITIES/LOGIN'), [:], FailureHandling.STOP_ON_FAILURE)

WebUI.scrollToElement(findTestObject('Exchange/Page_martintestforpackage/a_Basic Exchange Rate'), 0)

WebUI.click(findTestObject('Exchange/Page_martintestforpackage/a_Basic Exchange Rate'))

WebUI.waitForElementPresent(findTestObject('Page_martintestforpackage/You may obtain your API key at httpsopenexchangerates.org'), 
    0)

WebUI.callTestCase(findTestCase('Basic Exchange Rate Test/UTILITIES/CLOSE_BROWSER'), [:], FailureHandling.STOP_ON_FAILURE)

