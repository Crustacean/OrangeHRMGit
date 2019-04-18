import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import com.kms.katalon.core.checkpoint.Checkpoint as Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling as FailureHandling
import com.kms.katalon.core.testcase.TestCase as TestCase
import com.kms.katalon.core.testdata.TestData as TestData
import com.kms.katalon.core.testobject.TestObject as TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import internal.GlobalVariable as GlobalVariable
import org.openqa.selenium.Keys as Keys


//=====================
//Testin in Mobile
//=====================
WebUI.openBrowser('')

WebUI.setViewPortSize(150, 710)

WebUI.navigateToUrl('https://tryone-trials646.orangehrmlive.com/auth/login')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Username'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), '4g1aee90KyvxujnpjxJtNg==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_keyboard_arrow_down'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Logout'))

WebUI.delay(3)

WebUI.closeBrowser()


//=====================
//Testin in Tablet
//=====================
WebUI.openBrowser('')

WebUI.setViewPortSize(768, 710)

WebUI.navigateToUrl('https://tryone-trials646.orangehrmlive.com/auth/login')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Username'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), '4g1aee90KyvxujnpjxJtNg==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_keyboard_arrow_down'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Logout'))

WebUI.delay(3)

WebUI.closeBrowser()


//=====================
//Testin in Desktop
//=====================
WebUI.openBrowser('')

WebUI.maximizeWindow()

WebUI.navigateToUrl('https://tryone-trials646.orangehrmlive.com/auth/login')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/span_Username'))

WebUI.setText(findTestObject('Object Repository/Page_OrangeHRM/input_LOGIN Panel_txtUsername'), 'admin')

WebUI.setEncryptedText(findTestObject('Object Repository/Page_OrangeHRM/input_Username_txtPassword'), '4g1aee90KyvxujnpjxJtNg==')

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/input_Password_Submit'))

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/i_keyboard_arrow_down'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/Page_OrangeHRM/a_Logout'))

WebUI.delay(3)

WebUI.closeBrowser()

