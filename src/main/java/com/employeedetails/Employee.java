package com.employeedetails;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Employee {
	  private Integer id;
	    private String name;
	    private Integer salary;
	    private Integer age;
	    
	    public Employee() {
	    }
	    
		public Employee(Integer id, String name, Integer salary, Integer age) {
			super();
			this.id = id;
			this.name = name;
			this.salary = salary;
			this.age = age;
		}
		
		@Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	  

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public Integer getSalary() {
			return salary;
		}

		public void setSalary(Integer salary) {
			this.salary = salary;
		}

		public Integer getAge() {
			return age;
		}

		public void setAge(Integer age) {
			this.age = age;
		}

		@Override
		public String toString() {
			return "Employee [id=" + id + ", name=" + name + ", salary=" + salary + ", age=" + age + "]";
		}
		
		
		
		
	    

}
