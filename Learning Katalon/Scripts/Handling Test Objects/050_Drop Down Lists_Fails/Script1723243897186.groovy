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

'login page'
WebUI.setText(findTestObject('Object Repository/User Account Pages/Login Page/Registraction Section/input_Email address_create'), 
    '12@gmail.com')

'After clicking we are on registration page'
WebUI.click(findTestObject('Object Repository/User Account Pages/Login Page/Registraction Section/button_Create an account'))

'Inspect DoB elements. Year of birth is a "value".\r\nIf you Select by Index, it\'ll be the position on the list - 1, 2, 3 etc.\r\nSelect by Label - 2019 - not a good idea, because if there is a space it will fail to select.'
WebUI.selectOptionByLabel(findTestObject('User Account Pages/Registration Page/050_select_DoB_Day'), '2', false)

WebUI.selectOptionByValue(findTestObject('User Account Pages/Registration Page/060_select_DoB_Month'), '2', false)

'first value'
WebUI.selectOptionByIndex(findTestObject('User Account Pages/Registration Page/070_select_DoB_Year'), 2)

WebUI.click(findTestObject('Object Repository/User Account Pages/Registration Page/button_Register'))

'my account page'
WebUI.verifyElementVisible(findTestObject('User Account Pages/My account Page/h1_My account'))

WebUI.closeBrowser()

