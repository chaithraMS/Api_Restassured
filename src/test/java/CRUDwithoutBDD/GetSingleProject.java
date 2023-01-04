package CRUDwithoutBDD;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class GetSingleProject {
	
	
	
		
		@Test

		public void getProject() {
			
		 
			 Response response = RestAssured.get("http://localhost:8084/projects/TY_PROJ_419");
				//validation
				System.out.println(response.getContentType());
				System.out.println(response.getStatusCode());
				System.out.println(response.getStatusLine());
				System.out.println(response.getTime());
				System.out.println(response.getBody());
				System.out.println(response.getHeaders());
				System.out.println(response.jsonPath());
				System.out.println(response.htmlPath());
				System.out.println(response.xmlPath());

				response.then().log().all();
				System.out.println(response.then().assertThat().contentType(ContentType.JSON));
				response.then().assertThat().statusCode(200);
				response.then().assertThat().statusLine("HTTP/1.1 200 " );
				
	}
	}



