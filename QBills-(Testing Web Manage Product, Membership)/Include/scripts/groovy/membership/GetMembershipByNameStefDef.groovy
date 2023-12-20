package membership
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



class GetMembershipByNameStefDef {
	
	@Given("Open web Qbills untuk login get membership")
	def openWeb() {
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://qbills.vercel.app/login')
	}

	@When("cashier memasukkan username dan password yang valid untuk get membership")
	def inputUsernamePaswword() {
		
		WebUI.setText(findTestObject('Object Repository/Page_QBills  Login/input_Username_username'), 'arieflazuardi3')
		
		WebUI.click(findTestObject('Object Repository/Page_QBills  Login/label_Password'))
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_QBills  Login/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')
	}
	
	@And("click login button untuk get membership")
	def clickLoginButton() {
		
		WebUI.click(findTestObject('Object Repository/Page_QBills  Login/button_Login'))
	}
	
	@And("Pada halaman dashboard pilih fitur membership untuk melihat semua membership")
	def clickMembershipFeature() {
		
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Dashboard/a_Membership'))
	}
	
	@And("Pada search bar ketik nama membership yang ingin dicari")
	def inputMembershipName() {
		
		WebUI.setText(findTestObject('Object Repository/Page_Qbills  Membership/input_Search_search'), 'ada')
	}
	
	@And("Pada search bar ketik nama membership invalid yang ingin dicari")
	def inputInvalidMembershipName() {
		WebUI.setText(findTestObject('Object Repository/Page_Qbills  Membership/input_Search_search'), 'bagas')
		
	}

	@Then("Nama membership yang dicari akan muncul")
	def membershipByNameDisplayed() {
		
		WebUI.closeBrowser()
	}
	
	@Then("Nama membership tidak muncul karena tidak ada")
	def membershipByNameNotDisplayed() {
		WebUI.closeBrowser()
		
	}
}