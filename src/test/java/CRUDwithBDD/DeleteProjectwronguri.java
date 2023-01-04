package CRUDwithBDD;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.port;
import static io.restassured.RestAssured.when;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

public class DeleteProjectwronguri {
@Test
	
	public void deleteProjectTest() {
	baseURI="http://localhost";
	port=8080;
		when()
		  .delete("/projects/TY_PROJ_209")
			
		.then()
		
		
		.assertThat().statusCode(403)
		.assertThat().statusLine("HTTP/1.1 403 ")
		.log().all();
		
		
}

}
