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
import org.apache.xmlbeans.impl.xb.xsdschema.FieldDocument.Field.Xpath as Xpath
import org.openqa.selenium.WebDriver as WebDriver

WebUI.openBrowser('')

WebUI.navigateToUrl('https://katalon-demo-cura.herokuapp.com/')

WebUI.maximizeWindow()

WebUI.waitForElementVisible(findTestObject('MakeanOpp123'), 20)

WebUI.click(findTestObject('MakeanOpp123'))

WebUI.waitForElementPresent(findTestObject('Page_CURA Healthcare Service/username'), 5)

WebUI.sendKeys(findTestObject('Object Repository/Page_CURA Healthcare Service/username'), Username)

WebUI.waitForElementPresent(findTestObject('Object Repository/Page_CURA Healthcare Service/pswd'), 5)

WebUI.sendKeys(findTestObject('Object Repository/Page_CURA Healthcare Service/pswd'), password)

WebUI.click(findTestObject('Object Repository/Page_CURA Healthcare Service/Login_btn'))

