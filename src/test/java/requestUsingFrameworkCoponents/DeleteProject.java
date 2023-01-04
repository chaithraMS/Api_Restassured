
package requestUsingFrameworkCoponents;
import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import GenericLibraries.BaseClassWithSpecBuilder;
import GenericLibraries.EndPointsLibrary;
import io.restassured.http.ContentType;

public class DeleteProject extends BaseClassWithSpecBuilder {
	
@Test
	
	public void deleteProjectTest() throws Throwable {

	
		 String proId = elib.readDataFromExcel("Sheet2", 2, 1);
		 System.out.println(proId);
		given()
		.spec(requestSpec)
		.pathParam("Id", proId)
		
	.when()
	 .delete(EndPointsLibrary.deleteProject+"/{Id}")
	 
		
			//validation
	 .then()
		.assertThat().and()
		
		.log().all();
		
	}
}
