package javapractise;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class EmployeePayRollService {
	
	 public List<Employee> retriveData() 
	 {
	  
	   String sql="select * from employee_payrolls";
	  
	   try {
		   Connection con1 = DataConnect.createC();
		   Statement  statement=con1.createStatement();
		   List< Employee> list=new ArrayList<>();
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
	       }           catch (SQLException e)
	       {
		
		           e.printStackTrace();
	       }
	                   return list;
	   
	 }

	public void update()
	{
		String sql="update employee_payrolls set basic_pay=700000 where name='charlie'";
		Connection con1 = DataConnect.createC();
		try {
			Statement statement=con1.createStatement();
			statement.executeUpdate(sql);
			con1.close();
		    } 
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void updateUsing_PreparedStatement(String name)
	{
		String sql="update employee_payrolls set basic_pay=800000 where name=? ";
		Connection con1 = DataConnect.createC();
		try {
			PreparedStatement psmt=con1.prepareStatement(sql);
			psmt.setString(1, name);
			int result=psmt.executeUpdate();
			if(result==1) {
				System.out.println("Update Succesfully!");
			}
		    } 
		
		catch (SQLException e) {
			
			e.printStackTrace();
		}
		
	}
	public void retriveData_inBetween_Range()
	{
		String sql=" select * from  employee_payrolls WHERE start BETWEEN CAST('2019-01-05' AS DATE) AND DATE(NOW())";
		List< Employee> list=new ArrayList<>();
		Connection con1 = DataConnect.createC();
		
			Statement statement;
			try {
				statement = con1.createStatement();
				ResultSet result = statement.executeQuery(sql);
				list=getEmployeeData(result);
				System.out.println(list);
			} catch (SQLException e) {
					e.printStackTrace();
			}
			
    }

	private List<Employee> getEmployeeData(ResultSet result)
	{
	    List<Employee> list=new ArrayList<>();
            try {
		   while( result.next())
		   {
			   int id=result.getInt("id");
			   String name=result.getString("name");
			   String gender=result.getString("gender");
			   double basic_pay=result.getDouble("basic_pay");
			   LocalDate start=result.getDate("start").toLocalDate();
			   list.add(new Employee(id,name,gender,basic_pay,start));
			   		 
		   }
		  
	        } catch (SQLException e)
	    {
		
		e.printStackTrace();
	    }
	        return list;
	}
}
