package CRUDwithBDD;


import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;


import io.restassured.http.ContentType;

public class AddProjectWithemptyBodyTest {
	@Test

	public void addProject() {
		/*create json body using json simple*/
		
		JSONObject jobj = new JSONObject();
	
		baseURI="http://localhost";
		port=8084;
		
		/*prerequest for the script*/
		
		 given()
		 .body(jobj)
		  .contentType(ContentType.JSON)
		 
		 
		 //ACTION
		 .when()
		 
		 
             .post("/addProject")
		//validation
        .then()

		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(409)
		.assertThat().statusLine("HTTP/1.1 409 ")
		.assertThat().and()
		.log().all();
		

}}

