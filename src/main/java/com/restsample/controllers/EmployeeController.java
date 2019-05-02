package com.restsample.controllers;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.restsample.dtos.EmployeeDto;

@RestController
public class EmployeeController {

	@RequestMapping(value = "/sayhello", method = RequestMethod.GET)
	public String sayHello() {
		return "Hello From Employee";
	}
	
	
	@RequestMapping(value = "/getemployee", method = RequestMethod.GET)
	public EmployeeDto getEmployee() {
		EmployeeDto emp = new EmployeeDto();
		emp.setId(1);
		emp.setEmail("abinash.bastola@gmail.com");
		emp.setName("Abinash Bastola");
		emp.setSalary(10000);
		emp.setAddress("1700 tyvale ct");
		return emp;
	}
	
	
}
