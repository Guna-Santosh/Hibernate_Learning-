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
		
		//Question Object
		Question question = new Question();
		question.setQId(111);
		question.setQuestion("What is Java");
		
		//Answer Object
		Answer answer = new Answer();
		answer.setAId(101);
		answer.setAnswer("Java is a Programming Langulage ");
		
		question.setAnswer(answer);
		
		
		Session openSession = buildSessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
				
		openSession.save(question);
		beginTransaction.commit();
		
	}

}
