package GenericLibraries;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class BaseClassWithSpecBuilder {
	
	public JavaUtility jlib = new JavaUtility();
	public RestAssuredLibrary rlib = new RestAssuredLibrary();
	public DataBaseUtility dlib = new DataBaseUtility();
	public ExcelUtility elib = new ExcelUtility();
	public RequestSpecification requestSpec;
	public ResponseSpecification responseSpec;
	/**
	 * RequestSpecBuilder and ResponseSpecBuilder are classes in restAssured Library
	 * with the help of which we can store some common Actions in both request and response
	 * @author chaithra
	 */
	
	@BeforeSuite
	public void bsConfig() throws Throwable{
		dlib.connectToDB();
		RequestSpecBuilder builder = new RequestSpecBuilder();
		builder.setBaseUri("http://localhost");
		builder.setPort(8084);
		builder.setContentType(ContentType.JSON);
		requestSpec = builder.build();
	}

	
	
	@AfterSuite
	public void asConfig() throws Throwable
	{
		dlib.closeDataBase();
		ResponseSpecBuilder builder = new ResponseSpecBuilder();
		responseSpec = builder.expectContentType(ContentType.JSON).build();
		
	}
}








