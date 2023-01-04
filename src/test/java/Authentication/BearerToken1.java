package Authentication;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import GenericLibraries.JavaUtility;
import io.restassured.http.ContentType;

import static io.restassured.RestAssured.*;

public class BearerToken1 {
	
	/*token will be given by API developers*/
	@Test
	public void bearerToken() {
		baseURI ="https://api.github.com";
		JSONObject jobj = new JSONObject();
		jobj.put("name", "onlineproj"+new JavaUtility().getrandomnum());
		/*preconditions*/
		given()
		.auth()
		.oauth2("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")
		.body(jobj)	
		.contentType(ContentType.JSON)	
		
		.when()
		.post("/user/repos")
		.then().assertThat().statusCode(201).log().all();
	}

}
