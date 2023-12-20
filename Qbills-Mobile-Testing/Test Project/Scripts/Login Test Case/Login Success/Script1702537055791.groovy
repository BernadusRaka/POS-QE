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

Mobile.verifyElementExist(findTestObject('Login Page/UsernameColumn'), 0)

Mobile.tap(findTestObject('Login Page/UsernameColumn'), 0)

Mobile.setText(findTestObject('Login Page/UsernameColumn'), 'cashiertest', 0)

Mobile.verifyElementExist(findTestObject('Login Page/PasswordColumn'), 0)

Mobile.tap(findTestObject('Login Page/PasswordColumn'), 0)

Mobile.setText(findTestObject('Login Page/PasswordColumn'), 'cashiertest', 0)

Mobile.pressBack()

Mobile.verifyElementExist(findTestObject('Login Page/LoginButton'), 0)

Mobile.tap(findTestObject('Login Page/LoginButton'), 0)

Mobile.verifyElementExist(findTestObject('Dashboard Page/ManageProduct'), 0)

Mobile.tap(findTestObject('Dashboard Page/NextButton'), 0)

Mobile.verifyElementExist(findTestObject('Dashboard Page/SalesReport'), 0)

Mobile.tap(findTestObject('Dashboard Page/NextButton'), 0)

Mobile.verifyElementExist(findTestObject('Dashboard Page/Membership'), 0)

Mobile.tap(findTestObject('Dashboard Page/FinishButton'), 0)

Mobile.closeApplication()

