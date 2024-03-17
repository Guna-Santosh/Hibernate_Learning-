package com.test;

import java.io.FileInputStream;
import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
	public static void main(String[] args) throws Exception {
		System.out.println("Project was Started...");
		SessionFactory factory = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory();
		Employees emp=new Employees();
		emp.setFirstName("Radha");
		emp.setLastName("Karn");
		emp.setEmail("radha@gmail.com");
		emp.setPhNumber(9398);
		emp.setHireDate(new Date());
		emp.setJobId(0000);
		emp.setSalary(2500000);
		emp.setManagerId(00123);
		emp.setDepartmentId(020);
		FileInputStream fis=new FileInputStream("src/main/java/SIAV.jpg");
		byte[] data=new byte[fis.available()];
		fis.read(data);
		emp.setImage(data);
		emp.setWorkPlace("Vizag");
		System.out.println(emp);
		Session currentSession = factory.openSession();
		Transaction beginTransaction = currentSession.beginTransaction();
		currentSession.save(emp);
		beginTransaction.commit();



	}
}
