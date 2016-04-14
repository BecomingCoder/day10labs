package day10Labs;

import java.util.Date;

public class Employee {
	
	private String FirstName;
	private String LastName;
	private String DepartmentName;
	private String PhoneNumber;
	private String Position;
	private Date DOB;
	private float Salary;
	
	public Employee() {
		
		Salary = 5000.0f;
	}
	
	public Employee(String firstName, String lastName, float salary) {
		setSalary(salary);
		setFirstName(firstName);
		setLastName(lastName);
	}
	
	public Employee(String firstName, String lastName) {
		super();
		FirstName = firstName;
		LastName = lastName;
	}

	public void setLastName(String lastName) {
		LastName = lastName;
	}
	
	public String getLastName() {
		return LastName;
	}

	public String getFirstName() {
		return FirstName;
	}

	public void setFirstName(String firstName) {
		FirstName = firstName;
	}

	public String getDepartmentName() {
		return DepartmentName;
	}

	public void setDepartmentName(String departmentName) {
		DepartmentName = departmentName;
	}

	public String getPhoneNumber() {
		return PhoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		PhoneNumber = phoneNumber;
	}

	public String getPosition() {
		return Position;
	}

	public void setPosition(String position) {
		Position = position;
	}

	public Date getDOB() {
		return DOB;
	}

	public void setDOB(Date dOB) {
		DOB = dOB;
	}

	public float getSalary() {
		return Salary;
	}

	public void setSalary(float salary) {
		Salary = salary;
	}

}
