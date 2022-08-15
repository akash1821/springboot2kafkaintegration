package com.nit.akash.model;

import java.io.Serializable;

import lombok.Data;

@Data
public class Employee implements Serializable {
	private Integer empId;
	private String empName;
	private String empEmail;
	private Double empSal;
	private String empDept;
}
