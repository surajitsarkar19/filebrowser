package com.srs.filebrowser.controller;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import com.srs.filebrowser.model.Employee;
import com.srs.filebrowser.service.EmployeeService;

@Controller
@RequestMapping("/employee")
public class EmployeeController {
	
	private static final Logger logger = Logger.getLogger(HelloWorldController.class);
	
	@Autowired
	private EmployeeService employeeService;
	 
	public EmployeeService getEmployeeManager() {
		return employeeService;
	}
 
	public void setEmployeeManager(EmployeeService employeeManager) {
		this.employeeService = employeeManager;
	}
 
	@RequestMapping
	public ModelAndView handleRequest() {
		logger.info("in EmployeeController");
		ModelAndView mv = new ModelAndView("employee");
		mv.addObject("employeeList", this.employeeService.getEmployeeList());
		return mv;
	}
	
	@RequestMapping("*")
	@ResponseBody
	public String fallbackMethod(){
		return "fallback method";
	}
	
	@RequestMapping("/add")
	public ModelAndView addEmployee() {
		logger.info("in EmployeeController GET");
		return new ModelAndView("addEmployee", "employee", new Employee());
	}
	
	@RequestMapping(value="/add", method=RequestMethod.POST)
	public String addEmployee(@ModelAttribute("employee")Employee employee, 
		      BindingResult result, ModelMap model) {
		logger.info("in EmployeeController POST");
		/*if (result.hasErrors()) {
            return "error";
        }*/
		employeeService.addEmployee(employee);
		return "redirect:/employee";
	}
}
