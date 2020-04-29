package com.cg.demo;

import java.util.List;

public class Employee {
private int employeeid;
private String firstname;
private String lastname;
private Address address;
public void init() {
	System.out.println("init is called");
}
public void destroy() {
	System.out.println("destroy is called");
}
private List<String> jobs;
public List<String> getJobs() {
	return jobs;
}
public void setJobs(List<String> jobs) {
	this.jobs = jobs;
}
public Employee() {
	System.out.println("emp() constr");
}
public Employee(int employeeid, String firstname, String lastname, Address address) {
	System.out.println("param costr");
	this.employeeid = employeeid;
	this.firstname = firstname;
	this.lastname = lastname;
	this.address = address;
}
public int getEmployeeid() {
	return employeeid;
}
public void setEmployeeid(int employeeid) {
	this.employeeid = employeeid;
}
public String getFirstname() {
	return firstname;
}
public void setFirstname(String firstname) {
	this.firstname = firstname;
}
public String getLastname() {
	return lastname;
}
public void setLastname(String lastname) {
	this.lastname = lastname;
}
public Address getAddress() {
	return address;
}
public void setAddress(Address address) {
	System.out.println("set addresssS");
	this.address = address;
}
@Override
public String toString() {
	return "Employee [employeeid=" + employeeid + ", firstname=" + firstname + ", lastname=" + lastname + ", address="
			+ address + ", jobs=" + jobs + "]";
}

}
