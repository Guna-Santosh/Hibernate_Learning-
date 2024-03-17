package com.embeddingObject;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class EmbeddingExecutor {

	public static void main(String[] args) {

		Configuration config = new Configuration();
		config.configure("hibernate.cfg.xml");
		SessionFactory sf = config.buildSessionFactory();

		Student student = new Student();
		student.setId(00001);
		student.setName("Guna");

		Certificate certificate = new Certificate();
		certificate.setId("ja02");
		certificate.setCourse("Java");
		certificate.setDuration("3 Months");

		student.setCert(certificate);

		Address address = new Address();
		address.setArea("Brach Road");
		address.setCity("Vizag");
		address.setState("Andhra");
		address.setPinCode("530044");

		student.setAddress(address);

		Session se = sf.openSession();
		Transaction tx = se.beginTransaction();

		se.save(student);
		tx.commit();
	}

}
