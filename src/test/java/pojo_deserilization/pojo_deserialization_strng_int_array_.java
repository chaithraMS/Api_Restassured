package pojo_deserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClassForSerilizationDeserilization.Employee_details_1Str_1int_1_obj;



public class pojo_deserialization_strng_int_array_ {

	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		ObjectMapper map = new ObjectMapper();
		Employee_details_1Str_1int_1_obj data = map.readValue(new File("./combined.json"), Employee_details_1Str_1int_1_obj.class );
		System.out.println(data.getAddress());
		System.out.println(data.getEid());
		System.out.println(data.getEname());
		System.out.println(data.getSpouse());
		System.out.println(data.getEmail());
		System.out.println(data.getPhoneNo());

	}

}
