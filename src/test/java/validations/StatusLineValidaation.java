

package validations;

import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

import static io.restassured.RestAssured.*;

public class StatusLineValidaation {
	@Test
	public void StatusLineValTest() {
		
		baseURI = "http://localhost";
		port =8084;
		 String expectStatusLine = "HTTP/1.1 200 ";
		
		Response res =  given()
				
				.get("projects/TY_PROJ_1002");
		
		String actualStatusLine = res.getStatusLine();
		Assert.assertEquals(actualStatusLine, expectStatusLine);
		
		
		
	}

}


