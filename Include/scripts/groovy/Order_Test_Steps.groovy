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
import verifyResponses.verifyResponseOrderAPI

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
import handler.Test_Cases_Handling



class Order_Test_Steps {
	/**
	 * The step definitions below match with Katalon sample Gherkin steps
	 */
	String test_Cases
	def handler = new Test_Cases_Handling()
	def verifyRes = new verifyResponseOrderAPI()
	
	@Given("I want to test the API Order")
	def I_want_to_test_the_API_Order() {
		
	}

	@When("I execute the (.*) test case of Order API")
	def I_execute_the_testCase_test_case_of_Order_API(String testCase) {
		
		//Set to global Class
		test_Cases = testCase
		
		//Hit API using handler
		handler.Order_Api_Handling(test_Cases)
		
	}

	@Then("I verify the response of Order API")
	def I_verify_the_response_of_Order_API() {
		
		//Verify API Responses
		verifyRes.Verify_Responses_Order_API(test_Cases)
		
		
	}
}