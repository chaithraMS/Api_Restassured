package InterviewQuestions;

import java.io.File;
import java.io.IOException;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class WriteResponseInTextFile {
	
	public static void main(String[] args) throws IOException {
	String jsonString = "{\"username\":\"admin\", \"password\":\"password123\"}";
	  RequestSpecification request = RestAssured.given();
	  request.contentType(ContentType.JSON);
	  request.baseUri("https://restful-booker.herokuapp.com/auth");
	  request.body(jsonString);
	  
	   Response response = request.post();	
	   String responseAsString = response.asString();
	   
	    byte[] responseAsStringByte = responseAsString.getBytes();
	     File file = new File("src/test/java/targetFileForString.json");
	     Files.write(responseAsStringByte,file);
		
	}
	
	

}
