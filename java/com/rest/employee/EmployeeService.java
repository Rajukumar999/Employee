package com.rest.employee;

import java.util.ArrayList;
import java.util.List;

import javassist.NotFoundException;

public class EmployeeService {
	
	private List<Employee> employees = new ArrayList<Employee>();
	
	employees.add(new Employee("1","raj","kumar","rajkumar@gmail.com",987654321,"15th march",25000));
	employees.add(new Employee("2","veera","kumar","veerakumar@gmail.com",123456789,"12th feb",35000));
	
	public List<Employee> fetchAll() {

		
        return employees;
    }
	
	public Employee get(String id) throws NotFoundException {
        for (Employee emp :  employees) {
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
		 for (Employee emp :  employees) {
             if (id == emp.getEmpId()) {
            	 employees.remove(emp);
             }else{
                throw new NullPointerException("Resource not found with Id :: " + id);
             }
         }
	    }
			public String getTax(String id) {
		for(Employee emp :  employees) {
			  if (id == emp.getEmpId()) {
				  int empSal=(int)emp.getSalary();	
				  if(empSal<=250000) {
					  return emp.getEmpId()+emp.getfName()+emp.getLName()+emp.getSalary()*12;
				  }
				  if(empSal>250000 && empSal <=500000) {
					  return emp.getEmpId()+emp.getfName()+emp.getLName()+emp.getSalary()*12+emp.getSalary()*0.05*12+emp.getSalary()*0.02*12;
				  }
				  if(empSal>500000 && empSal <=1000000) {
					  return emp.getEmpId()+emp.getfName()+emp.getLName()+emp.getSalary()*12+emp.getSalary()*0.1*12+emp.getSalary()*0.02*12;
				  }
				  if(empSal>1000000) {
					  return emp.getEmpId()+emp.getfName()+emp.getLName()+emp.getSalary()*12+emp.getSalary()*0.2*12+emp.getSalary()*0.02*12;
				  }
			  }
			  
			  }		
		return null;
	}

}
