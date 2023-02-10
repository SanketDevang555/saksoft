package com.saksoft.crud.service;

import java.util.List;

import com.saksoft.crud.entity.EmployeeDetails;

public interface EmployeeService {
	public String createEmployee(EmployeeDetails emp);

	public List<EmployeeDetails> getEmployee();

	public EmployeeDetails getEmployee(int id);

	public String deleteEmployee(int id);

}
