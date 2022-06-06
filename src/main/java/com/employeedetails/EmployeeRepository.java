package com.employeedetails;

import org.springframework.data.repository.CrudRepository;


public interface EmployeeRepository extends CrudRepository<Employee, Integer>{

	Employee findOne();

	void delete(int id);

	


}
