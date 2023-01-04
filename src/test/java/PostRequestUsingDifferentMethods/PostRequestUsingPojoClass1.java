package PostRequestUsingDifferentMethods;

import static io.restassured.RestAssured.given;

import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

import pojoUtility.AddProjectPojoClass;

public class PostRequestUsingPojoClass1 {

	
	
	@Test

	public void createProjectTest() {
		AddProjectPojoClass apj = new AddProjectPojoClass("yuio", "p"+new JavaUtility().getrandomnum(), "created", 8);
		given()
		.body(apj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		
	     
	.assertThat().statusCode(201)
	
			.assertThat().statusLine("HTTP/1.1 201 ")
		.log().all();
		
			
	}

}

