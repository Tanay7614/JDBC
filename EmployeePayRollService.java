package javapractise;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayRollService {
	
	 List< Employee> list=new ArrayList<>();

	 public List<Employee> retriveData() 
	 {
	   String sql="select * from employee_payrolls";
	  
	   try {
		   Connection con1 = DataConnect.createC();
		   Statement  statement=con1.createStatement();
		   ResultSet result=statement.executeQuery(sql);
		  
		   while( result.next())
		   {
			   int id=result.getInt("id");
			   String name=result.getString("name");
			   String gender=result.getString("gender");
			   double basic_pay=result.getDouble("basic_pay");
			   LocalDate start=result.getDate("start").toLocalDate();
			   list.add(new Employee(id,name,gender,basic_pay,start));
			   		 
		   }
		   con1.close();
	       }   catch (SQLException e)
	       {
		   e.printStackTrace();
	       }
	   return list;
	   
	}

	public void update()
	{
		String sql="update employee_payrolls set basic_pay=600000 where name='charlie'";
		Connection con1 = DataConnect.createC();
		try {
			Statement statement=con1.createStatement();
			statement.executeUpdate(sql);
			System.out.println(list);	
			con1.close();
		    } 
		
		    catch (SQLException e)
		    {
			   e.printStackTrace();
		    }
		
	}
}
