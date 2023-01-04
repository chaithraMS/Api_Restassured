package pojo_script;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSerilizationDeserilization.Employee_details_1_int_array;


public class pojo_Int_Array_Serialization {
	
@Test
public void pojoArray() throws Throwable, Throwable, Throwable

{
	//initilze array 
	int[] phone= {8888, 89713939};
	//create an object of object class
	Employee_details_1_int_array emp = new Employee_details_1_int_array("chaithra", "ardgsd4", "anuchai@125", phone, "mandya");
	//create an object of objectMapper
	ObjectMapper obj = new ObjectMapper();
	//write data in json
	obj.writeValue(new File("./dataemp2.json"), emp);
}
}
