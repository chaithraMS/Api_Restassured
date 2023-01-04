package DataProvider;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import GenericLibraries.ExcelUtility;
import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;

import pojoUtility.AddProjectPojoClass1;

import static  io.restassured.RestAssured.*;

public class PostRequestUsingDataProvider {
	
	
	@ Test(dataProvider = "readDataFromExcel")
	public void addProjectTest(String createdBy, String projectName, String status, String teamSize) {
		
		AddProjectPojoClass1 apj = new AddProjectPojoClass1(createdBy, projectName+new JavaUtility().getrandomnum(), status, teamSize);
		given()
		.body(apj)
		.contentType(ContentType.JSON)
		.when()
		.post("http://localhost:8084/addProject")
		.then()
		
	     .assertThat().contentType(ContentType.JSON)
			.assertThat().statusCode(201)
			.assertThat().statusLine("HTTP/1.1 201 ")
			.log().all();
	}
	
	
	@DataProvider
	public Object[][]  readDataFromExcel() throws Throwable
	{
		ExcelUtility elib = new ExcelUtility();
		 Object[][] value = elib.readMultipleData("Sheet1");
		 return value;
	}
	
	

}



