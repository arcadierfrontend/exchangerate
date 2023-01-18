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

WebUI.click(findTestObject('Page_martintestforpackage/a_REGISTER  SIGN IN'))

WebUI.waitForElementPresent(findTestObject('Page_martintestforpackage/input_Your emailusername_username'), 0)

WebUI.waitForElementPresent(findTestObject('Page_martintestforpackage/input_Your password_password'), 0)

WebUI.setText(findTestObject('Page_martintestforpackage/input_Your emailusername_username'), 'martin@arcadier.com')

WebUI.setText(findTestObject('Page_martintestforpackage/input_Your password_password'), 'welcome8')

WebUI.waitForElementPresent(findTestObject('Page_martintestforpackage/input_Your password_login-submit'), 0)

WebUI.click(findTestObject('Page_martintestforpackage/input_Your password_login-submit'), FailureHandling.STOP_ON_FAILURE)

WebUI.waitForElementVisible(findTestObject('Exchange/Page_martintestforpackage/Exchange-Rate_Dropdown'), 0)

WebUI.mouseOver(findTestObject('Exchange/Page_martintestforpackage/Exchange-Rate_Dropdown'))

WebUI.mouseOver(findTestObject('Exchange/Page_martintestforpackage/Latest_item'))

WebUI.delay(3)

WebUI.click(findTestObject('Exchange/Page_martintestforpackage/Exchange-Rate_Dropdown'))

WebUI.mouseOver(findTestObject('Exchange/Page_martintestforpackage/Exchange-Rate_Dropdown'))

WebUI.selectOptionByIndex(findTestObject('Exchange/Page_martintestforpackage/Exchange-Rate_Dropdown'), 2)

WebUI.delay(3)

WebUI.navigateToUrl('https://martintestforpackage.sandbox.arcadier.io/user/item/detail/Instant-Coffee/cfbeb8fa-f0c7-485a-ab53-74f5cf04e450')

WebUI.waitForElementVisible(findTestObject('Page_martintestforpackage/a_ADD TO CART'), 0)

WebUI.click(findTestObject('Page_martintestforpackage/a_ADD TO CART'))

WebUI.navigateToUrl('https://martintestforpackage.sandbox.arcadier.io/user/order/cart')

WebUI.waitForElementVisible(findTestObject('Page_martintestforpackage/Checout_MY_CART'), 0)

WebUI.delay(3)

WebUI.callTestCase(findTestCase('Basic Exchange Rate Test/UTILITIES/CLOSE_BROWSER'), [:], FailureHandling.STOP_ON_FAILURE)

