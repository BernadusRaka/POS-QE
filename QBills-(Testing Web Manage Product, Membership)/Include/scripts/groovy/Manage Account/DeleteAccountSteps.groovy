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



class DeleteAccountSteps {

	@When("Admin klik checkbox dari account yang ingin dihapus")
	def delAccounts() {
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Account/input_Username_w-full rounded-lg bg-transparent outline-none'))

		WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Account/input_Username_w-full rounded-lg bg-transparent outline-none'))
	}
	@When("Admin klik tombol tempat sampah di tabel account")
	def delAccount() {
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Account/button__flex items-center justify-center rounded-xl border border-E1 bg-E1 text-E5 hoverborder-E2 hoverbg-E2 activescale-95 activeborder-E3 activebg-E3 p-1.5'))
	}
	@And("Admin klik delete button")
	def clickDel() {
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Account/button_Delete (2)'))
	}

	@And("Admin klik delete di pesan konfirmasi")
	def confirmDel() {
		WebUI.click(findTestObject("Object Repository/Page_Qbills  Manage Account/button_Delete"))
	}

	@Then("Muncul notifikasi berhasil menghapus account")
	def successMsg(String status) {
		String msg = WebUI.getAlertText("Object Repository/Page_Qbills  Manage Account/div_SuccessCongratulations, you have successfully deleted the Account")
		WebUI.verifyMatch(status,msg,true)
	}
}