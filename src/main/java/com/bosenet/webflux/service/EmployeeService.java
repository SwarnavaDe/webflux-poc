package com.bosenet.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosenet.webflux.dto.EmployeeDto;
import com.bosenet.webflux.repository.EmployeeRepository;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public Flux<EmployeeDto> getAllEmployees(){
		return repository.genrateData();
	}
	public Flux<EmployeeDto> getEmployeeAboveAge(int age){
		return repository.genrateData().filter(employee -> employee.getAge()>=age);
	}
	public Flux<EmployeeDto> getEmployeeByLocation(String location){
		return repository.genrateData().filter(employee -> employee.getLocation().equalsIgnoreCase(location));
	}
	
	public Mono<EmployeeDto> getEmployeeById(Long id){
		return repository.genrateData().filter(employee->employee.getEmpId()==id).next();
	}
}
