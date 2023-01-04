package EndToEndScenarios;

import org.testng.Assert;
import org.testng.annotations.Test;

import GenericLibraries.BaseClassWithSpecBuilder;
import GenericLibraries.EndPointsLibrary;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import  static io.restassured.RestAssured.*;
import pojoUtility.AddProjectPojoClass;

public class CreateProjectAndVerify  extends BaseClassWithSpecBuilder{
	@Test
	public void add() throws Throwable {

	AddProjectPojoClass adj = new AddProjectPojoClass("anu", "asdf"+jlib.getrandomnum(), "created", 15);
	 Response response = given()
	.body(adj)
	.contentType(ContentType.JSON)
	.when()
	.post(EndPointsLibrary.createProject);
	 
	   String expData = rlib.getJsonData(response, "projectId");
	  System.out.println(expData);
	  
	 String query = "select * from projects";
	  String actData = dlib.readDataFromDBAndValidate(query, 1, expData);
	  System.out.println(actData);
	  
	  Assert.assertEquals(actData, expData);
			  
	

}}
