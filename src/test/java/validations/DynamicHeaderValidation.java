package validations;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

import java.util.List;



public class DynamicHeaderValidation {
	@Test
	
	
	public void DynamicResponseTest() {
		baseURI="http://localhost";
		port =8084;
		String expectedId ="TY_PROJ_1003";
Response res = when().get("projects");
 List<String> actualPid = res.jsonPath().get("projectId");
 boolean flag =false;
 for(String aID:actualPid)
 { 
	 if(aID.equalsIgnoreCase(expectedId))
	 {
		 System.out.println("project id is found");
	 }
	 flag=true;
 }
	
 
 
 
 Assert.assertTrue(flag);
	}

}




