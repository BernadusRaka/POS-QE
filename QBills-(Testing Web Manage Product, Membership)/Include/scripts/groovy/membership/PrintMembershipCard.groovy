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



class PrintMembershipCard {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	@Given("Open QBillss Web to view membership card")
	def openWebQbills() {
		
		WebUI.openBrowser('')
		
		WebUI.navigateToUrl('https://qbills.vercel.app/login')
	}

	@When("Login dengan username dan password yang valid")
	def inputUsernamePassword() {
		WebUI.click(findTestObject('Object Repository/Page_QBills  Login/div_Username'))
		
		WebUI.setText(findTestObject('Object Repository/Page_QBills  Login/input_Username_username'), 'arieflazuardi3')
		
		WebUI.setEncryptedText(findTestObject('Object Repository/Page_QBills  Login/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')
	}

	@And("Click tombol login pada login page")
	def clickLoginButton() {
		
		WebUI.sendKeys(findTestObject('Object Repository/Page_QBills  Login/input_Password_password'), Keys.chord(Keys.ENTER))
		
	}
	
	@And("Pada halaman dashboard click fitur membership untuk view membership card")
	def clickMembershipFeature() {
		
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Dashboard/a_Membership'))
		
		
	}
	
	@And("Pada halaman membership click icon pencil untuk view membership card")
	def clickPencilIcon() {
		
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Membership/button_Alvi_flex items-center justify-cente_d488e3'))
		
		
	}
	
	@And("Click View Card")
	def clickVieqCard() {
		
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Membership/button_View Card'))
		
	}
	
	@Then("Membership Card berhasil ditampilkan")
	def membershipCardView() {
		
		WebUI.closeBrowser()
		
	}
}