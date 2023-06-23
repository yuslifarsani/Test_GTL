<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>order_API</name>
   <tag></tag>
   <elementGuidId>adabf7cb-018a-4874-9c1e-467b80d30783</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <useRalativeImagePath>false</useRalativeImagePath>
   <connectionTimeout>-1</connectionTimeout>
   <followRedirects>false</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n\&quot;order_id\&quot;: ${order_id},\n\&quot;order_description\&quot;:\&quot;${order_description}\&quot;,\n\&quot;order_status\&quot;:\&quot;${order_status}\&quot;,\n\&quot;last_updated_timestamp\&quot;:\&quot;${last_updated_timestamp}\&quot;,\n\&quot;special_order\&quot;:${special_order}\n}&quot;,
  &quot;contentType&quot;: &quot;application/json&quot;,
  &quot;charset&quot;: &quot;UTF-8&quot;
}</httpBodyContent>
   <httpBodyType>text</httpBodyType>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Content-Type</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>bd0f3efc-5854-46f1-8ce6-e6830a9bf37b</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>8.5.0</katalonVersion>
   <maxResponseSize>-1</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>www.test.id/processOrder</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>-1</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>26ab42af-7a0a-4d5b-980b-f0bce8aee284</id>
      <masked>false</masked>
      <name>order_id</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>792950e8-1e60-4521-9c47-0ed29fe677b9</id>
      <masked>false</masked>
      <name>order_description</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>6b150ee2-1289-4bfb-9679-96810caeb2db</id>
      <masked>false</masked>
      <name>order_status</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description></description>
      <id>f04f6111-de8c-4768-9bc2-0ce6d31a03fc</id>
      <masked>false</masked>
      <name>last_updated_timestamp</name>
   </variables>
   <variables>
      <defaultValue>true</defaultValue>
      <description></description>
      <id>afbe9ffa-5d92-4b27-aea7-d469b25df880</id>
      <masked>false</masked>
      <name>special_order</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*

import com.kms.katalon.core.testobject.RequestObject
import com.kms.katalon.core.testobject.ResponseObject
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS
import com.kms.katalon.core.webservice.verification.WSResponseManager

import groovy.json.JsonSlurper
import internal.GlobalVariable as GlobalVariable

RequestObject request = WSResponseManager.getInstance().getCurrentRequest()

ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
