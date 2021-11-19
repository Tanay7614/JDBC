package javapractise;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class Junit {
//	@Test
//	public void retriveDataFromDB()
//	{
//		EmployeePayRollService employeePayRollService=new EmployeePayRollService();
//		List<Employee> ep = employeePayRollService.retriveData();
//		Assert.assertEquals(6, ep.size());
//	}
//	@Test
//	public void updateSalaryFromDB()
//	{
//		EmployeePayRollService employeePayRollService=new EmployeePayRollService();
//		List<Employee> ep = employeePayRollService.retriveData();
//	    employeePayRollService.update();
//		
//	}
//	@Test
//	public void updateSalaryFromDBusing_prepareStatement() {
//		EmployeePayRollService employeePayRollService=new EmployeePayRollService();
//		employeePayRollService.updateUsing_PreparedStatement("charlie");
//	}
//	
//	@Test
//	public void retriveData_betweenRange() {
//		EmployeePayRollService employeePayRollService=new EmployeePayRollService();
//		employeePayRollService.retriveData_inBetween_Range();
//	}
	
	@Test
	public void find_avg_Salary() {
		EmployeePayRollService employeePayRollService=new EmployeePayRollService();
		Map<String, Double> emp_Avg_salary = employeePayRollService.avg_salary_Base_on_gender();
		System.out.println(emp_Avg_salary);
	}
}
