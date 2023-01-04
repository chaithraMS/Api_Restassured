package GenericLibraries;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.cj.jdbc.Driver;

public class DataBaseUtility {

	
	Connection con =null;
	/*
	 * CONNECT TO DATABASE
	 */
	public void connectToDB() throws Throwable {
		Driver driver = new Driver();
		DriverManager.registerDriver(driver);
		con = DriverManager.getConnection(IPathConstants.dbURL, IPathConstants.dbUsername, IPathConstants.dbPassword);
	}
	/*
	 * READ DATA FROM DATABASE AND VALIDATE
	 */
	
	 public String readDataFromDBAndValidate(String query, int ColumnIndex, String expdata) throws Throwable 
	   {
		    boolean flag = false;
		    ResultSet result = con.createStatement().executeQuery(query);
		    while(result.next()) {
		    	
		    	 
		    	 if(result.getString(ColumnIndex).equalsIgnoreCase(expdata))
		    	 {
		    		 flag = true;
		    		 break;
		    	 }
		    	
		    }
		    if (flag) {
		    	
		    	System.out.println("----->data verified");
		    	return expdata;
				
			}
		    else
		    {
				
				System.out.println("------->not verified");
				return "";

			}
	   }
	
	
	/*
	 * close database
	 */
	
	public void closeDataBase() throws Throwable {
		con.close();
	}
}
