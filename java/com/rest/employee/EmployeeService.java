package com.rest.employee;

import java.util.ArrayList;
import java.util.List;

import javassist.NotFoundException;

public class EmployeeService {
	
	private List<Employee> employees = new ArrayList<Employee>();
	
	
	public List<Employee> fetchAll() {

		employees.add(new Employee("1","raj","kumar","rajkumar@gmail.com",987654321,"15th march",25000));
		employees.add(new Employee("2","veera","kumar","veerakumar@gmail.com",123456789,"12th feb",35000));
		
        return employees;
    }
	
	public Employee fetchBy(String id) throws NotFoundException {
        for (Employee emp :  fetchAll()) {
             if (id == emp.getEmpId()) {
                return emp;
             }else{
                throw new NotFoundException("Resource not found with Id :: " + id);
             }
         }
         return null;
     }

	
	public void create(Employee emp) {
		employees.add(emp);
   }
	
	 public void update(Employee emp) {
         for (Employee emp1 : employees) {
            if (emp.getEmpId() == emp1.getEmpId()) {
            	employees.remove(emp1);
            	employees.add(emp);
            }
         }
    }
	 
	 public void delete(String id) throws NullPointerException {
		 for (Employee emp :  fetchAll()) {
             if (id == emp.getEmpId()) {
            	 employees.remove(emp);
             }else{
                throw new NullPointerException("Resource not found with Id :: " + id);
             }
         }
	    }
	
}
