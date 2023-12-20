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



class CreateAccountSteps {

	@Given("Admin masuk ke halaman manage account")
	def inManageAccountPage(String) {
		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://qbills.vercel.app/login')

		WebUI.click(findTestObject('Object Repository/Page_QBills  Login/label_Username'))

		WebUI.setText(findTestObject('Object Repository/Page_QBills  Login/input_username'), 'arieflazuardi3')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_QBills  Login/input_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

		WebUI.click(findTestObject('Object Repository/Page_QBills  Login/button_Login'))

		WebUI.click(findTestObject('Object Repository/Page_Qbills  Dashboard/a_Manage Account'))
	}

	@When("Admin klik add account buttton")
	def clickAddButton() {
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Account/button_Add Account'))
	}

	@And("Admin mengisi Fullname(.*), username(.*), dan password(.*) yang valid")
	def inputAccount() {
		WebUI.setText(findTestObject('Object Repository/Page_Qbills  Manage Account/input_w-full rounded-lg bg-transparent outl_e5cdbf'),
				'Kasir')
		WebUI.setText(findTestObject('Object Repository/Page_Qbills  Manage Account/input_w-full rounded-lg bg-transparent outl_e5cdbf'),
				'12345678')
	}

	@And("Admin mengisi Fullname(.*), username(.*), dan password(.*) yang sudah ada")
	def inputAvailableAcc() {
		WebUI.setText(findTestObject('Object Repository/Page_Qbills  Manage Account/input_w-full rounded-lg bg-transparent outl_e5cdbf'),
				'QECapstone')
		WebUI.setText(findTestObject('Object Repository/Page_Qbills  Manage Account/input_w-full rounded-lg bg-transparent outl_e5cdbf'),
				'12345678')
	}

	@And("Admin klik save button")
	def clickSave() {
		WebUI.click(findTestObject('Page_Qbills  Manage Account/button_Add'))
	}

	@Then("Muncul pesan berhasil menambahkan account")
	def addAcc(String msg) {
		String message = WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Account/p_Congratulations, you have successfully added the Account'))
		WebUI.verifyMatch(msg, message, true)
	}

	@Then("Muncul pesan error")
	def errorMsg(String msg) {
		String message = WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Account/p_Add data failed'))
		WebUI.verifyMatch(msg, message, true)
	}
}