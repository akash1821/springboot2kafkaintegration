package com.nit.akash.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nit.akash.model.Employee;
import com.nit.akash.model.EmployeeEntity;

public interface IEmpKafkaRepo extends JpaRepository<EmployeeEntity, Integer> {

}
