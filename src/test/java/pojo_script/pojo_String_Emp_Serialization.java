package pojo_script;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSerilizationDeserilization.Employee_details_1_str_array;


public class pojo_String_Emp_Serialization {
	@Test
	public void pojoString() throws Throwable, Throwable, Throwable
	{
		//initilize string array
		String[] s= {"chaithra@123","anup@1345"};
		//create an object of pojo class
		Employee_details_1_str_array emp = new Employee_details_1_str_array("ANUSHA", "tyss788", s, 12345, "banglore");
		//create an object of objectmapper
		ObjectMapper map = new ObjectMapper();
		//write data to json
		map.writeValue(new File("./dataemp3.json"), emp);
	}

	
}
