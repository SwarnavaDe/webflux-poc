package com.bosenet.webflux.repository;

import org.springframework.stereotype.Component;

import com.bosenet.webflux.dto.EmployeeDto;

import reactor.core.publisher.Flux;

@Component
public class EmployeeRepository {
	
	public Flux<EmployeeDto> genrateData(){
		EmployeeDto firstEmployee = new EmployeeDto(1L,"Swarnava De","IT","Berlin",24);
		EmployeeDto secondEmployee = new EmployeeDto(2L,"Henry","IT","Berlin",28);
		EmployeeDto thirdEmployee = new EmployeeDto(3L,"Suresh","IT","Kolkata",34);
		EmployeeDto fourthEmployee = new EmployeeDto(4L,"Nicole","HR","Berlin",32);
		
		Flux<EmployeeDto> source = Flux.just(firstEmployee,secondEmployee,thirdEmployee,fourthEmployee);
		return source;
	}
}
