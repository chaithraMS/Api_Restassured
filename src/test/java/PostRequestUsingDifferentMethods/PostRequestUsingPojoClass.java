package PostRequestUsingDifferentMethods;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;
import pojoUtility.AddProjectPojoClass;

public class PostRequestUsingPojoClass {
	
	@Test

	public void createProjectTest() {
		AddProjectPojoClass pj = new AddProjectPojoClass("yuio", "pYUU", "created", 8);
		given()
		.body(pj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		
	     .assertThat().contentType(ContentType.JSON)
			.assertThat().statusCode(201)
			.assertThat().statusLine("HTTP/1.1 201 ")
			.log().all();
			
			
	}

}
