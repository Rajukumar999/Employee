package com.rest.employee;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlAccessType;

@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class Employee implements Serializable{
	
	
	public Employee(String empId, String fName, String LName,String email,int phoneNo,String doj,int salary) {
	this.empId =empId
        this.doj = doj;
        this.fName = fName;
        this.LName = LName;
        this.email = email;
        this.phoneNo = phoneNo;
        this.doj = doj;
        this.salary = salary;
    }
	@XmlElement
	private String empId;
	private String fName;
	private String LName;
	private String email;
	private int phoneNo;
	private String doj;
	private int salary;
	
	
	public String getEmpId() {
		return empId;
	}
	public void setEmpId(String empId) {
		this.empId = empId;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getLName() {
		return LName;
	}
	public void setLName(String lName) {
		LName = lName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public int getPhoneNo() {
		return phoneNo;
	}
	public void setPhoneNo(int phoneNo) {
		this.phoneNo = phoneNo;
	}
	public String getDoj() {
		return doj;
	}
	public void setDoj(String doj) {
		this.doj = doj;
	}
	public int getSalary() {
		return salary;
	}
	public void setSalary(int salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", fName=" + fName + ", LName=" + LName + ", email=" + email + ", phoneNo="
				+ phoneNo + ", doj=" + doj + ", salary=" + salary + "]";
	}
	

	
}
