package InterviewQuestions;

import java.io.File;
import java.io.IOException;

import com.google.common.io.Files;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GettingResponseInJsonUsingByteArray {
	public static void main(String[] args) throws IOException {
		String jsonString = "{\"username\":\"admin\", \"password\":\"password123\"}";
		  RequestSpecification request = RestAssured.given();
		  request.contentType(ContentType.JSON);
		  request.baseUri("https://restful-booker.herokuapp.com/auth");
		  request.body(jsonString);
		  
		   Response response = request.post();	
		   
		  byte[] responseAsByteArray = response.asByteArray();
		  File targetFileForByteArray = new File("/src/test/java/targetFileForByteArray.json");
		  Files.write(responseAsByteArray, targetFileForByteArray);
	}
	

}


