package CRUDwithBDD;


import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;

public class AddProjectInTextFormat {

	@Test

	public void addProject() {
		/*create json body using json simple*/
		JavaUtility jlib = new JavaUtility();
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "chaithra");
		jobj.put("projectName", "aara"+jlib.getrandomnum());
		jobj.put("status", "created");
		jobj.put("teamsize", 5);
		baseURI="http://localhost";
		port=8084;
		/*prerequest for the script*/
		
		 given()
		 .body(jobj)
		 
		 
		  .contentType(ContentType.TEXT)
		 
		 
		 //ACTION
		 .when()
             .post("/addProject")
		//validation
        .then()

		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(500)
		.assertThat().statusLine("HTTP/1.1 500 ")
		.log().all();
		
}
}
