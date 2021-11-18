package javapractise;

import java.util.List;

import org.junit.Assert;
import org.junit.Test;



public class Junit
{
	@Test
	public void retriveDataFromDB()
	{
		EmployeePayRollService employeePayRollService=new EmployeePayRollService();
		List<Employee> ep = employeePayRollService.retriveData();
		Assert.assertEquals(6, ep.size());
	}	
}
