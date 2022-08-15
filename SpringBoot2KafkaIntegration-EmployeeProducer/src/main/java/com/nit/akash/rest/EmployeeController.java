package com.nit.akash.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.nit.akash.model.Employee;
import com.nit.akash.service.EmployeeProducerService;

@RestController
@RequestMapping("/employee")
public class EmployeeController {
	
	Logger logger = LoggerFactory.getLogger(EmployeeController.class);

	
	@Autowired
	private EmployeeProducerService service;
	
	@PostMapping("/save")
	public String saveEmployee(
				@RequestBody Employee emp
			) 
	{
		service.send(emp);
		logger.info("EMPLOYEE OBJECT IS SENT TO KAFKA PRODUCER");
		return "EMPLOYEE SAVED SUCCESSFULLY";
	}
}
