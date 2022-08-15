package com.nit.akash.model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "emp_kafka_tab")
public class EmployeeEntity implements Serializable {
	@Id()
	@Column(name = "emp_id")
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer empId;
	@Column(name = "ename")
	private String empName;
	@Column(name = "eemail")
	private String empEmail;
	@Column(name = "esal")
	private Double empSal;
	@Column(name = "edept")
	private String empDept;
}
