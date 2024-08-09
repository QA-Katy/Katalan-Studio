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

WebUI.maximizeWindow()

WebUI.navigateToUrl('http://www.automationpractice.pl/index.php')

WebUI.click(findTestObject('Home Page/button_Sign in'))

WebUI.setText(findTestObject('Object Repository/User Account Pages/Login Page/Registraction Section/input_Email address_create'), 
    '12@gmail.com')

WebUI.click(findTestObject('Object Repository/User Account Pages/Login Page/Registraction Section/button_Create an account'))

'*Delays are added to observe the changes while running tests'
WebUI.delay(3)

'Radio button can be added by "Click" command'
WebUI.click(findTestObject('Object Repository/User Account Pages/Registration Page/020_Radio_Gender_Mrs'))

WebUI.delay(3)

'Radio button can also be added by "Check" command'
WebUI.check(findTestObject('User Account Pages/Registration Page/010_Radio_Gender_Mr'))

WebUI.delay(3)

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/030_input_customer_First Name'), 'Abc')

WebUI.setText(findTestObject('Object Repository/User Account Pages/Registration Page/040_input_customer_Last Name'), 'Def')

WebUI.setEncryptedText(findTestObject('Object Repository/User Account Pages/Login Page/Login Section/input_Password'), 'aeHFOx8jV/A=')

WebUI.delay(3)

'The same for Check boxes - Both Click and Check work'
WebUI.check(findTestObject('User Account Pages/Registration Page/080_Check_Sign up for Newsletter'))

WebUI.delay(3)

WebUI.click(findTestObject('User Account Pages/Registration Page/080_Check_Sign up for Newsletter'))

WebUI.delay(3)

WebUI.click(findTestObject('Object Repository/User Account Pages/Registration Page/button_Register'))

WebUI.verifyElementVisible(findTestObject('User Account Pages/My account Page/h1_My account'))

WebUI.delay(3)

WebUI.closeBrowser()

