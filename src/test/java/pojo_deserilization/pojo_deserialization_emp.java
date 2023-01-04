package pojo_deserilization;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;

import pojoClassForSerilizationDeserilization.EmployeeDetailsPojo;

public class pojo_deserialization_emp {
	public static void main(String[] args) throws Throwable, Throwable, Throwable {
		ObjectMapper map = new ObjectMapper();
		EmployeeDetailsPojo data = map.readValue(new File("./empdata.json"), EmployeeDetailsPojo.class);
		System.out.println(data.getEmail());
		System.out.println(data.getAddress());
		System.out.println(data.getEid());
		System.out.println(data.getEname());
		System.out.println(data.getPhoneNo());
		
		
	}

}



