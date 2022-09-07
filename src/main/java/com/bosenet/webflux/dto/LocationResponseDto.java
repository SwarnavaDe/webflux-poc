package com.bosenet.webflux.dto;

public class LocationResponseDto {
	private Long empId;
	private String Location;
	
	public LocationResponseDto() {
	
	}
	
	public LocationResponseDto(Long empId, String location) {
		super();
		this.empId = empId;
		Location = location;
	}
	public Long getEmpId() {
		return empId;
	}
	public void setEmpId(Long empId) {
		this.empId = empId;
	}
	public String getLocation() {
		return Location;
	}
	public void setLocation(String location) {
		Location = location;
	}
	
	
}
