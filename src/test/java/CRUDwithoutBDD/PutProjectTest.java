package CRUDwithoutBDD;

import java.util.concurrent.TimeUnit;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.RestAssured;


import  io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class PutProjectTest {
		
		@Test

		public void updateProject() {
			/*create json body using json simple*/
			JavaUtility jlib = new JavaUtility();
			JSONObject jobj = new JSONObject();
			jobj.put("createdBy", "chaithu");
			jobj.put("projectName", "aru");
			jobj.put("status", "on going");
			jobj.put("teamsize", 6);
			
			/*prerequest for the script*/
			
			 RequestSpecification reqspec = RestAssured.given();
			 reqspec.body(jobj);
			 reqspec.contentType(ContentType.JSON);
			 	 
			 //ACTION
			 
			Response response = reqspec.put("http://localhost:8084/projects/TY_PROJ_804");
			//validation
			System.out.println(response.getContentType());
			System.out.println(response.getSessionId());
			System.out.println(response.getStatusCode());
			System.out.println(response.getStatusLine());
			System.out.println(response.getTimeIn(TimeUnit.MILLISECONDS));
			
			System.out.println(response.getTime());
			System.out.println(response.getBody());
			System.out.println(response.getHeaders());
			System.out.println(response.jsonPath());
			System.out.println(response.htmlPath());
			System.out.println(response.xmlPath());
			response.then().log().all();
			System.out.println(response.then().assertThat().contentType(ContentType.JSON));
			
		response.then().assertThat().statusCode(200);
			response.then().assertThat().statusLine("HTTP/1.1 200 " );
			
}
}
