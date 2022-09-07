package com.bosenet.webflux.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosenet.webflux.dto.EmployeeDto;
import com.bosenet.webflux.service.EmployeeService;

import reactor.core.publisher.Flux;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping("all")
	public Flux<EmployeeDto> getAllEmployees(){
		return service.getAllEmployees();
	}
}
