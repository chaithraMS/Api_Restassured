
package requestUsingFrameworkCoponents;


import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import GenericLibraries.BaseClassWithSpecBuilder;
import GenericLibraries.EndPointsLibrary;
import io.restassured.http.ContentType;

public class GetProjectUsingBaseclass  extends BaseClassWithSpecBuilder{
	
	
	@Test

	public void getSingleProjectTest() throws Throwable {
		 String proId = elib.readDataFromExcel("Sheet2", 1, 1);
		 System.out.println(proId);
		given()
		.spec(requestSpec)
		.pathParam("Id", proId)
		
	.when()
	 .get(EndPointsLibrary.getSingleProject+"{Id}")
	 
		
	 
			//validation
	 .then()
		.assertThat().and()
		.statusCode(200)
		
		.log().all();
		
	}			

}
