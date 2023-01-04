package CRUDwithBDD;

import java.io.File;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;

public class UploadImage {

@Test

public void fileupload(){
	
	File   file = new File("C:\\Users\\Admin\\Downloads\\download.jpg");
	
	given().multiPart("file", file, "multipart/form-data")
	.post("https://the-internet.herokuapp.com/upload")
	.thenReturn().then().log().all();
	
}

}

