package usefulFunction

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
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webui.keyword.WebUiBuiltInKeywords as WebUI
import com.kms.katalon.core.windows.keyword.WindowsBuiltinKeywords as Windows

import internal.GlobalVariable
import org.apache.commons.lang.RandomStringUtils as RandStr
import groovy.json.JsonSlurper

public class usefulFunctions {
	
	@Keyword
	def randWords(){

		return RandStr.random(11, true, false)
	}
	
	@Keyword
	def getTimestamp() {
		
		Date latestdate = new Date();
		return latestdate.getTime()
		
	}
	
	@Keyword
	def returnDataMaps(def response) {
		JsonSlurper json = new JsonSlurper()
		Map jsonResult = json.parseText(response.responseBodyContent)
		return jsonResult
	}
}
