package com.infotech.model;

public class Employee implements Comparable<Employee>{

	private Integer employeeId;
	private String employeeName;
	private Double salary;
	private String email;
	
	public Employee(Integer employeeId, String employeeName, Double salary, String email) {
		super();
		this.employeeId = employeeId;
		this.employeeName = employeeName;
		this.salary = salary;
		this.email = email;
	}
	

	public Integer getEmployeeId() {
		return employeeId;
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public Double getSalary() {
		return salary;
	}

	public String getEmail() {
		return email;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", employeeName=" + employeeName + ", salary=" + salary
				+ ", email=" + email + "]";
	}


	@Override
	public int compareTo(Employee o) {
		return this.getEmployeeName().compareTo(o.getEmployeeName());
	}
}
