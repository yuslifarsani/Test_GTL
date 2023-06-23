package handler

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

public class Test_Cases_Handling {

	def useful = new usefulFunctions()

	@Keyword
	def Order_Api_Handling(String testCases) {

		UUID uuid = UUID.randomUUID()

		switch(testCases) {

			case "Order is Created":

				GlobalVariable.responses = WS.sendRequest(findTestObject('order_API', [('order_id') : uuid, ('order_description') : useful.randWords(), ('order_status') : 'New', ('last_updated_timestamp') : useful.getTimestamp()
					, ('special_order') : false]))

				break;

			case "Order is failed due duplicate order_id":

				GlobalVariable.responses = WS.sendRequest(findTestObject('order_API', [('order_id') : 'DUPLICATE UUID', ('order_description') : useful.randWords(), ('order_status') : 'New', ('last_updated_timestamp') : useful.getTimestamp()
					, ('special_order') : false]))

				break;
			case "Order is failed due empty order_id":

				GlobalVariable.responses = WS.sendRequest(findTestObject('order_API', [('order_id') : '', ('order_description') : useful.randWords(), ('order_status') : 'New', ('last_updated_timestamp') : useful.getTimestamp()
					, ('special_order') : false]))

				break;
			case "Order is failed due empty order_status":

				GlobalVariable.responses = WS.sendRequest(findTestObject('order_API', [('order_id') : uuid, ('order_description') : useful.randWords(), ('order_status') : '', ('last_updated_timestamp') : useful.getTimestamp()
					, ('special_order') : false]))

				break;
			case "Order is failed due empty timestamp":

				GlobalVariable.responses = WS.sendRequest(findTestObject('order_API', [('order_id') : uuid, ('order_description') : useful.randWords(), ('order_status') : 'New', ('last_updated_timestamp') : ''
					, ('special_order') : false]))

				break;
			case "Order is failed due empty special_order":

				GlobalVariable.responses = WS.sendRequest(findTestObject('order_API', [('order_id') : uuid, ('order_description') : useful.randWords(), ('order_status') : 'New', ('last_updated_timestamp') : useful.getTimestamp()
					, ('special_order') : null]))

				break;
			default:
				KeywordUtil.markFailedAndStop("TEST CASE NOT FOUND")
		}
	}
}
