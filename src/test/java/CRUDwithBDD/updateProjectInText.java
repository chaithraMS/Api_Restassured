package CRUDwithBDD;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;

public class updateProjectInText {

	
	@Test
	public void addProject() {
		/*create json body using json simple*/
		JavaUtility jlib = new JavaUtility();
		JSONObject jobj = new JSONObject();
		jobj.put("created", "chai");
		jobj.put("projectname", "as"+jlib.getrandomnum());
		jobj.put("status", "completed");
		jobj.put("Teamsize", 6);
		
		baseURI="http://localhost";
		port=8084;
		
		/*prerequest for the script*/
		
		   given()
				   
		 .body(jobj)
		  .contentType(ContentType.TEXT)
		 
		 
		 //ACTION
		 .when()
		 
		 
             .put("/addProject/TY_PROJ_212")
		//validation
        .then()

		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(404)
		.assertThat().statusLine("HTTP/1.1 404 ")
		.assertThat().and()
		.log().all();
		
}
}