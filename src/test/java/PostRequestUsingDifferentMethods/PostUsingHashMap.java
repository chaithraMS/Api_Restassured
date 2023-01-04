package PostRequestUsingDifferentMethods;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;
import static io.restassured.RestAssured.port;

import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;

public class PostUsingHashMap {
	@Test

	public void addProject() {
		/*create json body using json simple*/
		JavaUtility jlib = new JavaUtility();
		HashMap hp = new HashMap();
		hp.put("createdBy", "chaithra");
		hp.put("projectName", "aara"+jlib.getrandomnum());
		hp.put("status", "created");
		hp.put("teamsize", 5);
		baseURI="http://localhost";
		port=8084;
		/*prerequest for the script*/
		
		 given()
		 .body(hp)
		  .contentType(ContentType.JSON)
		 
		 
		 //ACTION
		 .when()
             .post("/addProject")
		//validation
        .then()

		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(201)
		.assertThat().statusLine("HTTP/1.1 201 ")
		.log().all();
		
		

		
		
	}


}
