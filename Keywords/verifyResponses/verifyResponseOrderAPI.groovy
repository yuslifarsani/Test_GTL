package verifyResponses

import static com.kms.katalon.core.checkpoint.CheckpointFactory.findCheckpoint
import static com.kms.katalon.core.testcase.TestCaseFactory.findTestCase
import static com.kms.katalon.core.testdata.TestDataFactory.findTestData
import static com.kms.katalon.core.testobject.ObjectRepository.findTestObject
import static com.kms.katalon.core.testobject.ObjectRepository.findWindowsObject

import com.kms.katalon.core.annotation.Keyword
import com.kms.katalon.core.checkpoint.Checkpoint
import com.kms.katalon.core.cucumber.keyword.CucumberBuiltinKeywords as CucumberKW
import com.kms.katalon.core.mobile.keyword.MobileBuiltInKeywords as Mobile
import com.kms.katalon.core.model.FailureHandling
import com.kms.katalon.core.testcase.TestCase
import com.kms.katalon.core.testdata.TestData
import com.kms.katalon.core.testobject.TestObject
import com.kms.katalon.core.util.KeywordUtil
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import usefulFunction.usefulFunctions

public class verifyResponseOrderAPI {

	def useful = new usefulFunctions()

	@Keyword
	def Verify_Responses_Order_API(String testCases) {

		def responseText = useful.returnDataMaps(GlobalVariable.responses)

		if(testCases.equalsIgnoreCase("Order is Created")) {
			
			WS.verifyResponseStatusCode(GlobalVariable.responses , 200)
			WS.verifyElementPropertyValue(GlobalVariable.responses , 'order_status', 'created')
			
			
		}else{
			
			WS.verifyResponseStatusCode(GlobalVariable.responses , 500)
			WS.verifyElementPropertyValue(GlobalVariable.responses , 'order_status', 'failed')
			
		}

	}
}
