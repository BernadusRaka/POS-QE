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

Mobile.tap(findTestObject('Object Repository/Order Test/android.widget.EditText'), 0)

Mobile.setText(findTestObject('Object Repository/Order Test/android.widget.EditText'), 'raynaldo22', 0)

Mobile.tap(findTestObject('Object Repository/Order Test/android.widget.EditText (1)'), 0)

Mobile.setText(findTestObject('Object Repository/Order Test/android.widget.EditText (1)'), '12345678', 0)

Mobile.pressBack()

Mobile.tap(findTestObject('Object Repository/Order Test/android.widget.Button'), 0)

Mobile.tap(findTestObject('Object Repository/Order Test/android.widget.Button (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Order Test/android.widget.Button (2)'), 0)

'First Order Product Button '
Mobile.tapAtPosition(427, 1512)

Mobile.verifyElementExist(findTestObject('Object Repository/Order Test/ProductImage'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Order Test/ProductSize'), 0)

Mobile.tap(findTestObject('Object Repository/Order Test/ProductSize'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Order Test/PlusQuantity (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Test/PlusQuantity (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Test/PlusQuantity (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Order Test/AddCartButton'), 0)

Mobile.tap(findTestObject('Order Test/AddCartButton'), 0)

Mobile.pressBack()

Mobile.pressBack()

'Second Order Product Button '
Mobile.tapAtPosition(936, 1505)

Mobile.verifyElementExist(findTestObject('Object Repository/Order Test/ProductImage'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Order Test/ProductSize'), 0)

Mobile.tap(findTestObject('Object Repository/Order Test/ProductSize'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Order Test/PlusQuantity (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Test/PlusQuantity (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Test/PlusQuantity (1)'), 0)

Mobile.tap(findTestObject('Order Test/AddCartButton'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Order Test/AddCartButton'), 0)

Mobile.pressBack()

Mobile.pressBack()

'First Order Product Button '
Mobile.tapAtPosition(427, 1512)

Mobile.verifyElementExist(findTestObject('Object Repository/Order Test/ProductImage'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Order Test/ProductSize'), 0)

Mobile.tap(findTestObject('Object Repository/Order Test/ProductSize'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Order Test/PlusQuantity (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Test/PlusQuantity (1)'), 0)

Mobile.tap(findTestObject('Object Repository/Order Test/PlusQuantity (1)'), 0)

Mobile.verifyElementExist(findTestObject('Object Repository/Order Test/AddCartButton'), 0)

Mobile.tap(findTestObject('Order Test/AddCartButton'), 0)

Mobile.verifyElementExist(findTestObject('Order Test/OrderButton (1)'), 0)

Mobile.tap(findTestObject('Order Test/OrderButton (1)'), 0)

Mobile.verifyElementExist(findTestObject('Order Test/QRISButton'), 0)

Mobile.tap(findTestObject('Order Test/QRISButton'), 0)

Mobile.verifyElementExist(findTestObject('Order Test/QRPayment'), 0)

Mobile.verifyElementExist(findTestObject('Order Test/QRConfirmButton'), 0)

Mobile.tap(findTestObject('Order Test/QRConfirmButton'), 0)

Mobile.verifyElementExist(findTestObject('Order Test/android.view.View (1)'), 0)

Mobile.closeApplication()

