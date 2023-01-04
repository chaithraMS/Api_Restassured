package Authentication;

import static io.restassured.RestAssured.*;

import org.testng.annotations.Test;

import io.restassured.response.Response;

public class Auth2Test2 {
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
/*post the request to get token*/
		 String  token = response.jsonPath().get("access_token");
		 System.out.println(token);
		 /*using token verify the api*/
		 given()
		 .auth().oauth2(token)
		 .pathParam("User_id", 4156)
		 .when().post("http://coop.apps.symfonycasts.com/api/{User_id}/barn-unlock")
		 .then().log().all();

	}
}


