package com.bosenet.webflux.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.bosenet.webflux.dto.EmployeeDto;
import com.bosenet.webflux.repository.EmployeeRepository;

import reactor.core.publisher.Flux;


@Service
public class EmployeeService {
	
	@Autowired
	private EmployeeRepository repository;
	
	public Flux<EmployeeDto> getAllEmployees(){
		return repository.genrateData();
	}
	
}
