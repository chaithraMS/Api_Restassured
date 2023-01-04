package validations;

import static io.restassured.RestAssured.*;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;

public class StaticResponseValidation {
@Test
	
	
	public void getAllProjectsTest() {
		String expectedPname ="aara591";
		
 Response response = when().get("http://localhost:8084/projects");
  String actualPname = response.jsonPath().get("[4].projectName");
  Assert.assertEquals(actualPname, expectedPname);

		
	}

}
