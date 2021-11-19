package javapractise;

import java.time.LocalDate;

public class Employee {
       int id;
       String name;
       String gender;
       double basic_pay;
       LocalDate start;
       
       public Employee(int id, String name, String gender, double basic_pay, LocalDate start) {
		super();
		this.id = id;
		this.name = name;
		this.gender = gender;
		this.basic_pay = basic_pay;
		this.start = start;
	}
	   
    public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public double getBasic_pay() {
		return basic_pay;
	}
	public void setBasic_pay(double basic_pay) {
		this.basic_pay = basic_pay;
	}
	public LocalDate getStart() {
		return start;
	}
	public void setStart(LocalDate start) {
		this.start = start;
	}

    @Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", gender=" + gender + ", basic_pay=" + basic_pay + ", start="
				+ start + "]";
	}
	
}
