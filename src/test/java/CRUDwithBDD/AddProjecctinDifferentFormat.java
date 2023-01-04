package CRUDwithBDD;


import static io.restassured.RestAssured.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class AddProjecctinDifferentFormat {
	@Test

	public void addProject() {
		/*create json body using json simple*/
		JavaUtility jlib = new JavaUtility();
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "chai");
		jobj.put("projectName", "aara"+jlib.getrandomnum());
		jobj.put("status", "started");
		jobj.put("teamsize", 5);
		baseURI="http://localhost";
		port=8084;
		
		/*prerequest for the script*/
		
		 given()
		 
		 
		 .body(jobj)
		  .contentType(ContentType.HTML)
		 
		 
		 //ACTION
		 .when()
             .put("/addProject")
		//validation
        .then()
       

		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(500)
		.assertThat().and()
		.assertThat().using()
		.assertThat().statusLine("HTTP/1.1 500 ")
		.log().all();
}
}


