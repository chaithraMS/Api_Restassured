package CRUDwithBDD;

import org.testng.annotations.Test;

import static io.restassured.RestAssured.*;
import io.restassured.http.ContentType;


public class GetAllProjects {

	@Test

	public void getProject() {
		baseURI="http://localhost";
		port=8084;
		 when()
		 .get("/projects")
		 .then()
			
			.assertThat().contentType(ContentType.JSON)
			.assertThat().statusCode(200)
			.assertThat().statusLine("HTTP/1.1 200 ")
			.log().all();
			
}
}
