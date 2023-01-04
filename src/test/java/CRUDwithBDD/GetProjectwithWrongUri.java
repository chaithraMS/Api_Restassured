package CRUDwithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;


public class GetProjectwithWrongUri {
	
	@Test

	public void getSingleProjectTest() {
		baseURI="http://localhost";
		port=8080;
		
	 when()
	 .get("/projects/TY_PROJ_210")
	 
		
			//validation
	 .then()
		
		
		.assertThat().statusCode(403)
		.assertThat().statusLine("HTTP/1.1 403 ")
		.assertThat().and()
		
		.log().all();
		
	}

}
