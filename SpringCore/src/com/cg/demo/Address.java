package com.cg.demo;

public class Address {
private String areaName;
private String city;
public Address() {
	System.out.println("addr() constr");
}
public Address(String areaName, String city) {
	super();
	this.areaName = areaName;
	this.city = city;
}
@Override
public String toString() {
	return "Address [areaName=" + areaName + ", city=" + city + "]";
}
public String getAreaName() {
	return areaName;
}
public void setAreaName(String areaName) {
	this.areaName = areaName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}

}
