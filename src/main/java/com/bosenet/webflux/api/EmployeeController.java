package com.bosenet.webflux.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bosenet.webflux.dto.EmployeeDto;
import com.bosenet.webflux.dto.LocationResponseDto;
import com.bosenet.webflux.service.EmployeeService;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	@Autowired
	EmployeeService service;
	
	@GetMapping(value="all",produces=MediaType.TEXT_EVENT_STREAM_VALUE )
	public Flux<EmployeeDto> getAllEmployees(){
		return service.getAllEmployees();
	}
	
	@GetMapping(value="greater-age/{age}",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<EmployeeDto> getEmployeesGreaterThanAge(@PathVariable int age){
		return service.getEmployeeAboveAge(age);
	}
	@GetMapping(value="location-greater-age/{age}",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<LocationResponseDto> getLocationOfEmployeesGreaterThanAge(@PathVariable int age){
		return service.getLocationOfEmployeesAboveAge(age);
	}
	
	@GetMapping(value="at-location/{location}",produces = MediaType.TEXT_EVENT_STREAM_VALUE)
	public Flux<EmployeeDto> getEmployeesAtLocation(@PathVariable String location){
		return service.getEmployeeByLocation(location);
	}
	
	@GetMapping("id/{id}")
	public Mono<EmployeeDto> getEmployeeById(@PathVariable Long id){
		return service.getEmployeeById(id);
	}
}
