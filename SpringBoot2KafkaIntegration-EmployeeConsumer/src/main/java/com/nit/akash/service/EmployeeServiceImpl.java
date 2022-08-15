package com.nit.akash.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nit.akash.model.Employee;
import com.nit.akash.model.EmployeeEntity;
import com.nit.akash.repo.IEmpKafkaRepo;

@Service
public class EmployeeServiceImpl implements IEmployeeService {
	
	Logger logger = LoggerFactory.getLogger(EmployeeServiceImpl.class);
	
	@Autowired
	private IEmpKafkaRepo repo;
	
	@Override
	public void saveEmployee(EmployeeEntity emp) {
		EmployeeEntity savedEmp = repo.save(emp);
		logger.info("EMPLOYEE IS SAVED WITH EMPLOYEE ID {} ",savedEmp.getEmpId());
	}

}
