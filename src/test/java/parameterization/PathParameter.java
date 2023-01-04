package parameterization;

import org.testng.annotations.Test;

import static  io.restassured.RestAssured.*;

public class PathParameter {
@Test
	
	public void pathParameter(){
		String proId="TY_PROJ_1008";
		
		given().pathParam("projectID", proId)
		
		.when().delete("http://localhost:8084/projects/{projectID}")

		.then()
				.assertThat().statusCode(204).log().all();
	}
	}

