package pojo_script;

import java.io.File;

import org.codehaus.jackson.map.ObjectMapper;
import org.testng.annotations.Test;

import pojoClassForSerilizationDeserilization.Employee_details_1Str_1int_1_obj;
import pojoClassForSerilizationDeserilization.Spouse;



public class pojo_For_Int_String_Array {
	@Test
	public void pojo() throws Throwable, Throwable, Throwable
	{
		//inilitize String array
		String[] s= {"anu14","chandhu15"};
		//initilize int array
		int[] phone= {1234, 87987};
		//create an object of spouse
		Spouse s1=new Spouse("varsha", "arundhathi");
		//create an object pojo
		Employee_details_1Str_1int_1_obj emp = new Employee_details_1Str_1int_1_obj("chaithra", "tyss", s, phone, "germany", s1);
		//create an object mapper
		ObjectMapper map = new ObjectMapper();
		//write data into json
		map.writeValue(new File("./combined.json"), emp);
		
		
	}

}
