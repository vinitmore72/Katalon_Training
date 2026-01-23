<?xml version="1.0" encoding="UTF-8"?>
<WebServiceRequestEntity>
   <description></description>
   <name>USERPOST</name>
   <tag></tag>
   <elementGuidId>398d0499-09a7-4780-808b-0a28c43d957d</elementGuidId>
   <selectorMethod>BASIC</selectorMethod>
   <smartLocatorEnabled>false</smartLocatorEnabled>
   <useRalativeImagePath>false</useRalativeImagePath>
   <autoUpdateContent>false</autoUpdateContent>
   <connectionTimeout>0</connectionTimeout>
   <followRedirects>true</followRedirects>
   <httpBody></httpBody>
   <httpBodyContent>{
  &quot;text&quot;: &quot;{\n  \&quot;userName\&quot;: \&quot;${username}\&quot;,\n  \&quot;password\&quot;: \&quot;${password}\&quot;\n}\n&quot;,
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
      <webElementGuid>2d87553d-9fc0-4fff-a804-bf66ab684e58</webElementGuid>
   </httpHeaderProperties>
   <httpHeaderProperties>
      <isSelected>true</isSelected>
      <matchCondition>equals</matchCondition>
      <name>Accept</name>
      <type>Main</type>
      <value>application/json</value>
      <webElementGuid>3091b6af-17d5-4e09-9358-f0912fe3ba99</webElementGuid>
   </httpHeaderProperties>
   <katalonVersion>10.4.3</katalonVersion>
   <maxResponseSize>0</maxResponseSize>
   <migratedVersion>5.4.1</migratedVersion>
   <path></path>
   <restRequestMethod>POST</restRequestMethod>
   <restUrl>https://demoqa.com/Account/v1/User</restUrl>
   <serviceType>RESTful</serviceType>
   <soapBody></soapBody>
   <soapHeader></soapHeader>
   <soapRequestMethod></soapRequestMethod>
   <soapServiceEndpoint></soapServiceEndpoint>
   <soapServiceFunction></soapServiceFunction>
   <socketTimeout>0</socketTimeout>
   <useServiceInfoFromWsdl>true</useServiceInfoFromWsdl>
   <variables>
      <defaultValue>''</defaultValue>
      <description>vinit5</description>
      <id>6a6fe366-8de8-417f-9a68-6cfe545e5f8b</id>
      <masked>false</masked>
      <name>username</name>
   </variables>
   <variables>
      <defaultValue>''</defaultValue>
      <description>Vinit101@</description>
      <id>4d6682b8-cb6d-4c8c-820a-39b8f6263c9f</id>
      <masked>false</masked>
      <name>password</name>
   </variables>
   <verificationScript>import static org.assertj.core.api.Assertions.*&#xd;
&#xd;
import com.kms.katalon.core.testobject.RequestObject&#xd;
import com.kms.katalon.core.testobject.ResponseObject&#xd;
import com.kms.katalon.core.webservice.keyword.WSBuiltInKeywords as WS&#xd;
import com.kms.katalon.core.webservice.verification.WSResponseManager&#xd;
&#xd;
import groovy.json.JsonSlurper&#xd;
import internal.GlobalVariable as GlobalVariable&#xd;
&#xd;
RequestObject request = WSResponseManager.getInstance().getCurrentRequest()&#xd;
&#xd;
ResponseObject response = WSResponseManager.getInstance().getCurrentResponse()</verificationScript>
   <wsdlAddress></wsdlAddress>
</WebServiceRequestEntity>
