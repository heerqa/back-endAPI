package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.modal.Employee;


@Service
public class EmployeeService {
	
	
	public List<Employee> getEmplyeeList(){
		List<Employee> employee=new ArrayList<Employee>();
		Employee e1=new Employee(1, "Joe");
		Employee e2=new Employee(2, "Sam");
		Employee e3=new Employee(3, "Sabrina");
		employee.add(e1);
		employee.add(e2);
		employee.add(e3);
		
		
		return employee;
		
		}

}
