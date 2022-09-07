package com.bosenet.webflux.dto;

public class EmployeeDto {
	private Long empId;
	private String name;
	private String department;
	private String location;
	private int age;
	
	public EmployeeDto() {
		
	}
	public EmployeeDto(Long empId, String name, String department, String location, int age) {
		super();
		this.empId = empId;
		this.name = name;
		this.department = department;
		this.location = location;
		this.age = age;
	}
	
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDepartment() {
		return department;
	}
	public void setDepartment(String department) {
		this.department = department;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
