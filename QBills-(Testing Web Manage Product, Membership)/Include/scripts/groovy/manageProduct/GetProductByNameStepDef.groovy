package manageProduct
import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.checkpoint.CheckpointFactory
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testcase.TestCaseFactory
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testdata.TestDataFactory
import com.kms.katalon.core.testobject.ObjectRepository
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI

import internal.GlobalVariable

import org.openqa.selenium.WebElement
import org.openqa.selenium.WebDriver
import org.openqa.selenium.By

import com.kms.katalon.core.mobile.keyword.internal.MobileDriverFactory
import com.kms.katalon.core.webui.driver.DriverFactory

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.testobject.ConditionType
import com.kms.katalon.core.testobject.TestObjectProperty

import com.kms.katalon.core.mobile.helper.MobileElementCommonHelper
import com.kms.katalon.core.util.KeywordUtil

import com.kms.katalon.core.webui.exception.WebElementNotFoundException

import cucumber.api.java.en.And
import cucumber.api.java.en.Given
import cucumber.api.java.en.Then
import cucumber.api.java.en.When



class GetProductByNameStepDef {
	
	@Given("Cashier login dan berada pada halaman dashboard Qbills")
	def ontheDashboardPage() {
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://qbills.vercel.app/login')
		
		WebUI.setText(findTestObject('Object Repository/Page_QBills  Login/input_Username_username'), 'arieflazuardi3')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_QBills  Login/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')
		
		WebUI.sendKeys(findTestObject('Object Repository/Page_QBills  Login/input_Password_password'), Keys.chord(Keys.ENTER))
		
	}

	@When("Cashier click fitur manage product")
	def clickManageProductFeature() {
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Dashboard/a_Manage Product'))
		
	}
	
	@And("Pada search bar, cashier menuliskan produk sesuai nama")
	def searchAProductByName() {
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Product/div_Search Product'))
		
		WebUI.setText(findTestObject('Object Repository/Page_Qbills  Manage Product/input_Search Product_search'), 'matcha')
	}

	@Then("Produk sesuai nama berhasil ditampilkan")
	def productDisplayed() {
		WebUI.closeBrowser()
		
	}
}