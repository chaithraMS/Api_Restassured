package CRUDwithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;


public class DeleteProjectTest {

	
@Test
	
	public void deleteProjectTest() {
	baseURI="http://localhost";
	port=8084;
		when()
		  .delete("/projects/TY_PROJ_208")
			
		.then()
		
		.assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(204)
		.assertThat().statusLine("HTTP/1.1 204 ")
		.log().all();
		
		
}
}

