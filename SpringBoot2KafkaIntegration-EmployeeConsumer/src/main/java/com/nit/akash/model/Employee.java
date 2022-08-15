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
public class Employee implements Serializable {
	private Integer empId;
	private String empName;
	private String empEmail;
	private Double empSal;
	private String empDept;
}
