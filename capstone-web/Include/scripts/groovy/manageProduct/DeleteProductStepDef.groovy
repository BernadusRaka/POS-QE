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



class DeleteProductStepDef {

	@Given("Cashier telah login dan berada pada halaman dashbord Qbills")
	def onTheDashboardPage() {

		WebUI.openBrowser('')

		WebUI.navigateToUrl('https://qbills.vercel.app/login')

		WebUI.setText(findTestObject('Object Repository/Page_QBills  Login/input_Username_username'), 'arieflazuardi3')

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_QBills  Login/input_Password_password'), '9NLz+4tGZcQ=')

		WebUI.click(findTestObject('Object Repository/Page_QBills  Login/div_Password'))

		WebUI.setEncryptedText(findTestObject('Object Repository/Page_QBills  Login/input_Password_password'), 'RigbBhfdqOBGNlJIWM1ClA==')

		WebUI.click(findTestObject('Object Repository/Page_QBills  Login/button_Login'))
	}

	@When("Cashier click manage product feature")
	def clickManageProductFeature() {
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Dashboard/a_Manage Product'))
	}

	@And("Click icon gambar sampah pada product yang akan dihapus")
	def clickTrashIconOnTheProduct() {
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Product/input_NORMAL_beforecontent peer form-checkb_2fd3b5'))
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Product/button_Delete (1)'))
		
	}

	@And("click Delete Confirmation")
	def clickDeleteConfirmation() {
		WebUI.click(findTestObject('Object Repository/Page_Qbills  Manage Product/button_Delete'))
		
	}

	@Then("Produk berhasil terhapus")
	def productDeleted() {
		WebUI.closeBrowser()
	}
}