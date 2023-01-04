package requestUsingFrameworkCoponents;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.BaseClassWithSpecBuilder;
import GenericLibraries.EndPointsLibrary;
import io.restassured.http.ContentType;

import static  io.restassured.RestAssured.*;

public class PostUsingBaseClass extends BaseClassWithSpecBuilder
{

	
	@Test
	public void addProject() {
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "chaithra");
		jobj.put("projectName", "aar"+jlib.getrandomnum());
		jobj.put("status", "created");
		jobj.put("teamsize", 5);
	
		given()
		.spec(requestSpec)
		.body(jobj)
		
		 
		 //ACTION
		 .when()
            .post(EndPointsLibrary.createProject)
		//validation
    .then()
	.assertThat().statusCode(201)
		.assertThat().statusLine("HTTP/1.1 201 ")
		.log().all();
	}
	
}
