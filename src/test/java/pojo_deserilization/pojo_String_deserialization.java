package pojo_deserilization;

import java.io.File;
import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import com.mysql.cj.result.Field;

import pojoClassForSerilizationDeserilization.Employee_details_1_str_array;



public class pojo_String_deserialization {

	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		ObjectMapper map = new ObjectMapper();
		Employee_details_1_str_array data = map.readValue(new File("./dataemp3.json"), Employee_details_1_str_array.class);
         System.out.println(data.getAddress());
         System.out.println(data.getEid());
         System.out.println(data.getEname());
         System.out.println(data.getPhoneNo());
         System.out.println(data.getEmail());
	}

}
