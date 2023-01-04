
package requestChaining;

import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import pojoUtility.AddProjectPojoClass1;

import  static io.restassured.RestAssured.*;

public class PostAndDeleteProjectTest {
	
	@Test
	
	public void postAndDeleteTest() {
	/*pre-requesites*/
		baseURI= "http://localhost";
		port =8084;
		AddProjectPojoClass1 adj = new AddProjectPojoClass1("chaithra", "php"+new JavaUtility().getrandomnum(), "created", "5");
		Response response = given()
				.body(adj)
				.contentType(ContentType.JSON)
				.when()
				.post("/addProject");
				String proId = response.jsonPath().get("projectId");
				System.out.println(proId);
				
				/*sending in another request*/
				given()
				.pathParam("projectId", proId)
				.when()
				.delete("projects/{projectId}")
				.then()
				.log()
				.all();
			
	}

}
