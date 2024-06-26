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
		question.setQId(117);
		question.setQuestion("What is Angular");
		
		//Answer Object
		Answer answer = new Answer();
		answer.setAId(115);
		answer.setAnswer("Angular is a  Langulage ");
		
		question.setAnswer(answer);
		
		
		Session openSession = buildSessionFactory.openSession();
		Transaction beginTransaction = openSession.beginTransaction();
				
//		openSession.save(question);
//		openSession.save(answer);
		 Answer load = openSession.load(Answer.class, 105);
		 System.out.println(load);
		beginTransaction.commit();
		
	}

}
