package pojo_script;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSerilizationDeserilization.EmployeeDetailsPojo;
import pojoClassForSerilizationDeserilization.Spouse;



public class pojo_object_serilization {
@Test
public void object() throws Throwable, Throwable, Throwable
{
	//create an object of spouse class
	Spouse s=new Spouse("anup", "achhu");
	//create an object of pojo class
	EmployeeDetailsPojo pojo = new EmployeeDetailsPojo("chaithra", "TYSSsd", "nandhu@123", 897139391,"land");
	//create an object of objectMApper
	ObjectMapper map = new ObjectMapper();
	//write data into json file
	map.writeValue(new File("./dataspouse.json"), pojo);
}

}

