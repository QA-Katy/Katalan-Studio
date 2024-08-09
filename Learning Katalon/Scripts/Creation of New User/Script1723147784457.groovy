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

WebUI.navigateToUrl('http://www.automationpractice.pl/index.php')

WebUI.click(findTestObject('Object Repository/Home Page/Button_Sign in'))

WebUI.setText(findTestObject('Object Repository/User Account Pages/Login Page/Registraction Section/input_Email address_create'), '123456@gmail.com')

WebUI.click(findTestObject('Object Repository/User Account Pages/Login Page/Registraction Section/button_Create an account'))

WebUI.click(findTestObject('Object Repository/User Account Pages/Registration Page/020_Radio_Gender_Mrs_id_gender'))

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/030_input_customer_First Name'), '1234')

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/040_input_customer_Last Name'), '5678')

WebUI.setEncryptedText(findTestObject('Object Repository/User Account Pages/Login Page/Login Section/input_Password'), 'aeHFOx8jV/A=')

WebUI.click(findTestObject('Object Repository/User Account Pages/Registration Page/button_Register'))

WebUI.authenticate('', '', '', 0)

WebUI.closeBrowser()
