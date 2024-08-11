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

WebUI.maximizeWindow()

WebUI.click(findTestObject('Object Repository/Page_My Shop/a_Best Sellers'))

WebUI.click(findTestObject('Page_My Shop/a_Blouse'))

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_Blouse - My Shop/a_Color_White'))

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_Blouse - My Shop/button_Add to cart'))

WebUI.click(findTestObject('Object Repository/Add to Cart/Page_Blouse - My Shop/button_Proceed to checkout'))

WebUI.verifyElementText(findTestObject('Object Repository/Add to Cart/Page_Order - My Shop/span_Number of Products'), '1 product')

WebUI.delay(3)

WebUI.closeBrowser()

