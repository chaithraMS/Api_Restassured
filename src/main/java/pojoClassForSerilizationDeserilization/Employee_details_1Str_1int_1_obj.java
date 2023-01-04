package pojoClassForSerilizationDeserilization;

public class Employee_details_1Str_1int_1_obj {

	//declaration
		String Ename;
		String Eid;
		String[] Email;
		int[] PhoneNo;
		String Address;
		Object Spouse;
		public Employee_details_1Str_1int_1_obj(String ename, String eid, String[] email, int[] phoneNo, String address,
				Object spouse) {
			super();
			Ename = ename;
			Eid = eid;
			Email = email;
			PhoneNo = phoneNo;
			Address = address;
			Spouse = spouse;
		}
		
		public Employee_details_1Str_1int_1_obj()
		{
			
		}

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

		public String[] getEmail() {
			return Email;
		}

		public void setEmail(String[] email) {
			Email = email;
		}

		public int[] getPhoneNo() {
			return PhoneNo;
		}

		public void setPhoneNo(int[] phoneNo) {
			PhoneNo = phoneNo;
		}

		public String getAddress() {
			return Address;
		}

		public void setAddress(String address) {
			Address = address;
		}

		public Object getSpouse() {
			return Spouse;
		}

		public void setSpouse(Object spouse) {
			Spouse = spouse;
		}
		
		
		
}
