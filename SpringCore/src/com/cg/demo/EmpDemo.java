package com.cg.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmpDemo {
	public static void main(String[] args) {
		//ApplicationContext 
		AbstractApplicationContext
		ctx = new ClassPathXmlApplicationContext("emp.xml");
		   Employee employee=(Employee)ctx.getBean("emp");
		   System.out.println(employee);
		   ctx.registerShutdownHook();
		

	}

}
//parameterized constructor is called here.
//in the bean we need to use constructor-arg tag so that it will call the parameterized constructor.