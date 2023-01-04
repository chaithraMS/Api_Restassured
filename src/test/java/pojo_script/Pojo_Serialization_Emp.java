package pojo_script;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSerilizationDeserilization.EmployeeDetailsPojo;



public class Pojo_Serialization_Emp {
@Test
public void pojoserilization() throws Throwable, Throwable, Throwable
{
	//create an object of object class
	EmployeeDetailsPojo pojo = new EmployeeDetailsPojo("anup", "caspgemini", "anup@123", 123456, "mandya");
	//create an object of objectMapper
	ObjectMapper map=new ObjectMapper();
	//write the value to the json file
	map.writeValue(new File("./empdata.json"), pojo);
}
}

