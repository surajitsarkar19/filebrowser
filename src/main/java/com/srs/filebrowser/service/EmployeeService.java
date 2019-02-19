package com.srs.filebrowser.service;

import java.util.List;

import com.srs.filebrowser.model.Employee;

public interface EmployeeService {
	List<Employee> getEmployeeList();
	void addEmployee(Employee emp);
}
