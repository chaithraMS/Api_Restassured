package requestUsingFrameworkCoponents;

import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.BaseClassWithSpecBuilder;
import GenericLibraries.EndPointsLibrary;

public class PutProject extends BaseClassWithSpecBuilder {

	
	@Test
	public void addProject() throws Throwable {
		
		
		JSONObject jobj = new JSONObject();
		jobj.put("createdBy", "anup");
		jobj.put("projectName", "koushik"+jlib.getrandomnum());
		jobj.put("status", "on-going");
		jobj.put("teamsize", 10);
		 String proId = elib.readDataFromExcel("Sheet2", 3, 1);
		 System.out.println(proId);
	
		given()
		.spec(requestSpec)
		.body(jobj)
		.pathParam("Id", proId)
		 
		 //ACTION
		 .when()
            .put(EndPointsLibrary.updateProject+"{Id}")
		//validation
    .then()
	.assertThat().statusCode(200)
		.assertThat().statusLine("HTTP/1.1 200 ")
		.log().all();
	}
	
}
