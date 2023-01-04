package pojoClassForSerilizationDeserilization;

public class EmployeeDetailsPojo {
	
	//declaration
	String Ename;
	String Eid;
	String Email;
	int PhoneNo;
	String Address;
	
	//intialization constructor
	
	public EmployeeDetailsPojo(String ename, String eid, String email, int phoneNo, String address) {
		super();
		Ename = ename;
		Eid = eid;
		Email = email;
		PhoneNo = phoneNo;
		Address = address;
	}
	
	
	public EmployeeDetailsPojo() {
		
	}

	//getterss and setters method
	public String getEname() {
		return Ename;
	}


	
	public void setEname(String ename) {
		Ename = ename;
	}


	public String getEid() {
		return Eid;
	}


	public void setEid(String eid) {
		Eid = eid;
	}


	public String getEmail() {
		return Email;
	}


	public void setEmail(String email) {
		Email = email;
	}


	public int getPhoneNo() {
		return PhoneNo;
	}


	public void setPhoneNo(int phoneNo) {
		PhoneNo = phoneNo;
	}


	public String getAddress() {
		return Address;
	}


	public void setAddress(String address) {
		Address = address;
	}
	
	

}
