package requestChaining;

import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import pojoUtility.AddProjectPojoClass1;

import  static io.restassured.RestAssured.*;

public class PostAndGetProjectTest {
	
	@Test
	 public void requestchaining() {
		
		baseURI ="http://localhost";
		port =8084;
		AddProjectPojoClass1 adj = new AddProjectPojoClass1("chaithra", "php"+new JavaUtility().getrandomnum(), "created", "5");
		Response response = given()
				.body(adj)
				.contentType(ContentType.JSON)
				.when()
				.post("/addProject");
		System.out.println(response);
				String proId = response.jsonPath().get("projectId");
				
				
				
				System.out.println(proId);
		given()
		.pathParam("projectId", proId)
		.when()
		.get("/projects/{projectId}")
		.then()
		.assertThat()
		.log().all();
					
	}

}
