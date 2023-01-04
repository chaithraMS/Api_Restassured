package Authentication;

import org.testng.annotations.Test;
import static  io.restassured.RestAssured.*;
public class BearerTokenTest {
	

		@Test
		public void authentication(){
			given()
			 		.auth().oauth2("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")
			.when()
					.get("https://api.github.com/user/repos")
			.then()
					.assertThat().statusCode(200).log().all();
		}
		}

