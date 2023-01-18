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

WebUI.scrollToElement(findTestObject('Page_martintestforpackage/span_Plug-ins'), 0)

WebUI.click(findTestObject('Page_martintestforpackage/span_Plug-ins'))

WebUI.scrollToElement(findTestObject('Page_martintestforpackage/Avialable_Basic_Exchange_Rate'), 0)

WebUI.click(findTestObject('Page_martintestforpackage/Available_Details'))

WebUI.click(findTestObject('Page_martintestforpackage/a_Uninstall_Exchange'))

WebUI.delay(3)

WebUI.waitForElementPresent(findTestObject('Page_martintestforpackage/Uninstall_Okay'), 0)

WebUI.click(findTestObject('Page_martintestforpackage/Uninstall_Okay'))

WebUI.delay(2)

WebUI.callTestCase(findTestCase('Basic Exchange Rate Test/UTILITIES/CLOSE_BROWSER'), [:], FailureHandling.STOP_ON_FAILURE)

