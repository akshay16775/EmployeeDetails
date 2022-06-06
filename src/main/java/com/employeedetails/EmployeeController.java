package com.employeedetails;


	import java.util.*;
	import org.springframework.beans.factory.annotation.*;
	import org.springframework.web.bind.annotation.*;




	    @RestController
		public class EmployeeController {
		 
		    @Autowired
		    private EmployeeService employeeService;
		    
		    @RequestMapping("/employees")
		    public List<Employee> getAllEmployes(){
		    	return employeeService.getAllEmployees();
		    }
		    
		    @RequestMapping("/employees/{id}")
		    public Employee getEmployee(@PathVariable int id){
		    return employeeService.getEmployee(id);
		    }
		    
		    @RequestMapping(method=RequestMethod.POST, value="/employees")
		    public void addEmployee(@RequestBody Employee employee){
		    employeeService.addEmployee(employee);
		    }
		    
		    @RequestMapping(method=RequestMethod.PUT, value="/employees/{id}")
		    public void updateEmployee(@RequestBody Employee employee, @PathVariable int id){
		    employeeService.updateEmployee(id, employee);
		    }
		    
		    @RequestMapping(method=RequestMethod.DELETE, value="/employees/{id}")
		    public void deleteEmployee(@PathVariable int id){
		    employeeService.deleteEmployee(id);
		    }
	    }

