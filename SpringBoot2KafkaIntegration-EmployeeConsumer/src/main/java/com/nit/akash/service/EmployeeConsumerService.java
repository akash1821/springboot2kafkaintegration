package com.nit.akash.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

import com.nit.akash.model.Employee;
import com.nit.akash.model.EmployeeEntity;
import com.nit.akash.repo.IEmpKafkaRepo;

@Component
public class EmployeeConsumerService {
	@Autowired
	private IEmployeeService service;

	Logger logger = LoggerFactory.getLogger(EmployeeConsumerService.class);
	
	/*
	 * @Autowired private IEmployeeService service;
	 */
	@KafkaListener(topics = "${my.app.topicname}", groupId = "groupId")
	public void addEmp(Employee emp) {
		System.out.println(emp);
		logger.info("CONSUMER IS READING OBJECT FROM TOPIC");
		EmployeeEntity employeeEntity = new EmployeeEntity();
		employeeEntity.setEmpName(emp.getEmpName());
		employeeEntity.setEmpDept(emp.getEmpDept());
		employeeEntity.setEmpEmail(emp.getEmpEmail());
		employeeEntity.setEmpSal(emp.getEmpSal());
		service.saveEmployee(employeeEntity); 
	}
}
