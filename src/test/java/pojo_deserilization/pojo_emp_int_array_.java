package pojo_deserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import pojoClassForSerilizationDeserilization.Employee_details_1_int_array;



public class pojo_emp_int_array_ {

	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		ObjectMapper map = new ObjectMapper();
		Employee_details_1_int_array data = map.readValue(new File("./dataemp2.json"),
				Employee_details_1_int_array.class);
		System.out.println(data.getAddress());
		System.out.println(data.getEid());
		System.out.println(data.getEname());

		System.out.println(data.getEmail());
		System.out.println(data.getPhoneNo());
		// System.out.println(data.getClass());

	}

}
