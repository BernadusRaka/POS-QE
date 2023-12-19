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



class AddProductStepDef {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Cashier telah login dan berada pada halaman dashboard")
	def onTheDashboardPage() {
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://qbills.vercel.app/login')
		
		WebUI.setText(findTestObject('Object Repository/Page_QBills  Login/input_Username_username'), 'arieflazuardi3')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_QBills  Login/input_Password_password'), '9NLz+4tGZcQ=')
		
		WebUI.click(findTestObject('Object Repository/Page_QBills  Login/div_Password'))
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_QBills  Login/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')
		
		WebUI.click(findTestObject('Object Repository/Page_QBills  Login/button_Login'))
		
	}

	@When("Pada halaman dashboard click fitur manage product")
	def clickManageProduct() {
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Dashboard/a_Manage Product'))
		
	}
	
	@And("Pilih Add Product")
	def clickAddProduct() {
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Product/span_Add Product'))
		
	}

	@And ("Masukkan data-data produk tanpa ada satupun yang kosong")
	def inputDataProduct() {
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Product/div_CategoryCoffeeNon CoffeeMealSnack'))
		
		WebUI.selectOptionByValue(findTestObject('Object Repository/Page_Qbills  Manage Product/select_CoffeeNon CoffeeMealSnack'),
			'Non Coffee', true)
		
		WebUI.setText(findTestObject('Object Repository/Page_Qbills  Manage Product/input_Name_name'), 'matcha')
		
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Product/label_Ingredient'))
		
		WebUI.setText(findTestObject('Object Repository/Page_Qbills  Manage Product/input_Ingredient_ingredient'), 'es, macha')
	}
	
	@And("Click save")
	def clickSaveButton() {
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Product/button_Save'))
		
	}
	
	@Then("Produk baru berhasil ditambahkan")
	def productAdded() {
		WebUI.closeBrowser()
		
	}
}