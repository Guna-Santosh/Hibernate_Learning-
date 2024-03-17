package com.OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class OneToOneExecutor {

	public static void main(String[] args) {

		Configuration config =new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory buildSessionFactory = config.buildSessionFactory();
		
		System.out.println(buildSessionFactory);
		Session openSession = buildSessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
				
//		openSession.save(null);
//		beginTransaction.commit();
		
	}

}
