package com.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class FetchingData {
	/*
	 * get() & load() both will present in Session interface & it accepts the
	 * parameter are entity class & primary_key, this methods will use to retrieve the data from the DB 
	 * 
	 * Session -> get()  :  It returns null if object is not found in cache as well as on DB.
	 * 						Use if you are not sure that object exists in DB or not.
	 * 							
	 * Session -> load() :  It returns ObjectNotFoundException if object is not found in cache as well as on DB.
	 * 						Use if you are sure that object exists.
	 */
	public static void main(String[] args) {
		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();
		Session se = sf.openSession();
//		Employees employees = (Employees) se.load(Employees.class, 5); // ObjectNotFoundException -> if primary key value not available in DB
//		Employees employees = (Employees) se.get(Employees.class, 5); // null -> if primary key value not available in DB
		Employees employees = (Employees) se.get(Employees.class, 4); 
		Employees employeesa = (Employees) se.get(Employees.class, 4); 
//		System.out.println(employees.getFirstName());
//		System.out.println(employeesa.getFirstName());
	}
}
