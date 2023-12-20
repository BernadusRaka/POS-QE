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

Mobile.startApplication('E:\\MBKM\\app-release.apk', true)

Mobile.tap(findTestObject('Login Page/UsernameColumn'), 0)

Mobile.setText(findTestObject('Login Page/UsernameColumn'), 'raynaldo22', 0)

Mobile.tap(findTestObject('Login Page/PasswordColumn'), 0)

Mobile.setText(findTestObject('Login Page/PasswordColumn'), '12345678', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Login Page/LoginButton'), 0)

Mobile.tap(findTestObject('See Product/CrossButton'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Search Product/SearchColumn'), 0)

Mobile.tap(findTestObject('Object Repository/Search Product/SearchColumn'), 0)

Mobile.setText(findTestObject('Object Repository/Search Product/SearchColumn'), 'Caramel', 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Search Product/ProductVerify2'), 0)

Mobile.closeApplication()

