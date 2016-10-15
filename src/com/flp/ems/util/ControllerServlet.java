package com.flp.ems.util;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.flp.ems.dao.EmployeeDaoDS;
import com.flp.ems.domain.Employee;

@Controller
@RequestMapping(value = "/controller")
public class ControllerServlet {
	
	private Employee employee;
	
	@Autowired
	 private EmployeeDaoDS empDAO;
	
	{
		employee = new Employee();
	}
	
	@RequestMapping(method =RequestMethod.POST, value="/addEmployee")
	public String addEmployee(){
		
		return "employeeForm";
	}

}
