package javapractise;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DataConnect
{
            static Connection con;
	    public static Connection createC() 
	    {
		    String jdbcurl = "jdbc:mysql://localhost:3306/payroll_services";
		    String username="root";
		    String passWord="Tanaybr7614";
		
		try {
				Class.forName("com.mysql.jdbc.Driver");
				System.out.println("Driver loaded successfully");
				con=DriverManager.getConnection(jdbcurl, username, passWord);
				System.out.println("connection is successfull "+con);
				
		    } catch (Exception e)
		    {
		                e.printStackTrace();
		    }
		    return con;
		
	    }
}
