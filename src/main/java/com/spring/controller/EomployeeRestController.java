package com.spring.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.modal.Employee;
import com.service.EmployeeService;
import com.service.LoginService;


@RestController
@RequestMapping("/restapi")
public class EomployeeRestController {
	
	
	@Autowired
	private EmployeeService employeeService;
	
	@RequestMapping(value="/employeelist", method=RequestMethod.GET)
	public List<Employee> getEmployeeList(){
		
		return employeeService.getEmplyeeList();
	
	}
}
