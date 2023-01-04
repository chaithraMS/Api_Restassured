package parameterization;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

public class PathParamget {
	
@Test
	
	public void pathParameter(){
	baseURI ="http://localhost";
	port =8084;
		String proId="TY_PROJ_1005";
		
		given().pathParam("projectID", proId)
		
		.when()
		.get("/projects/{projectID}")

		.then()
				.assertThat().statusCode(200).log().all();
	}
	}




