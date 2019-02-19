package com.srs.filebrowser.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.srs.filebrowser.model.Employee;
import com.srs.filebrowser.service.EmployeeService;

@Service
public class EmployeeServiceImpl implements EmployeeService {
	
	private static List<Employee> employeeList;
	 
	public EmployeeServiceImpl(){
		 employeeList = new ArrayList<Employee>();
		 employeeList.add(new Employee("1", "Mike", "Smith"));
		 employeeList.add(new Employee("2", "John", "Taylor"));
		 employeeList.add(new Employee("3", "Dave", "Wilson"));	 
	}
 
	@Override
	public List<Employee> getEmployeeList(){
		return employeeList;
	}

	@Override
	public void addEmployee(Employee emp) {
		employeeList.add(emp);
	}
}
