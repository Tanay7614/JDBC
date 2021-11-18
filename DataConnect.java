package javapractise;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Enumeration;

public class DataConnect {
      
	   
	       public static void main(String[] args)
	       {
			
	                String jdbcurl = "jdbc:mysql://localhost:3306/payroll_services";
			String username="root";
		        String passWord="Tanaybr7614";
		        Connection con;
		
		try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver loaded successfully");
				con=DriverManager.getConnection(jdbcurl, username,passWord);
				System.out.println("Connection is succesful "+con);
		    } catch (Exception e)
		    {
		      e.printStackTrace();
		    }
		
		    listdriver();
		
               }
		private static void listdriver()
		{
			Enumeration<Driver> driverList=DriverManager.getDrivers();
			while(driverList.hasMoreElements())
			{
				Driver driverClass=driverList.nextElement();
				System.out.println(" "+driverClass.getClass().getName());
			}
		}
}
