package Authentication;

import org.testng.annotations.Test;

import io.restassured.response.Response;

import static io.restassured.RestAssured.*;

public class Auth2Test
 {
	
	@Test
		
		public void authentication(){
			  Response response = given()
					 .formParam("client_id", "chaithraapitest")
						.formParam("client_secret", "dd950d03442db54079ed614e01cc9259")
						.formParam("grant_type", "client_credentials")
						.formParam("redirect_uri", "http://example.com")
						.formParam("code", "authorization_code")
						.when()
						.post("http://coop.apps.symfonycasts.com/token");
			  
			  System.out.println(response);
			  String token = response.jsonPath().get("access_token");
			  System.out.println(token);
			  given()
			  .auth().oauth2(token)
			  .pathParam("USER_ID",4156)
			  
			  .when()
			  .post("http://coop.apps.symfonycasts.com/api/{USER_ID}/eggs-count")
			  .then().log().all();
	}

}
