package PostRequestUsingDifferentMethods;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;

import  static io.restassured.RestAssured.*;



public class PostRequestUsingJsonFile {
	
	
	@Test
	
	public void createPostTest() {
		
	
     File file = new File("./src/test/java/post.json");
     given()
     .body(file)
     .contentType(ContentType.JSON)
     .and()     
     .when()
     .post("http://localhost:8084/addProject")
     .then()
     .assertThat()
     .assertThat().contentType(ContentType.JSON)
		.assertThat().statusCode(201)
		.assertThat().statusLine("HTTP/1.1 201 ")
		.log().all();
		
		
		
		
	}

}
