package com.nit.akash.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

import com.nit.akash.model.Employee;

@Component
public class EmployeeProducerService {
	
	Logger logger = LoggerFactory.getLogger(EmployeeProducerService.class);
	
	@Value("${my.app.topicname}")
	private String topic;
	
	@Autowired
	private KafkaTemplate<String, Employee> template;
	
	public void send(Employee emp) {
		template.send(topic, emp);
		logger.info("PRODUCER IS SENDING EMPLOYEE OBJECT TO TOPIC");
	}
}
