package com.hql;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.OneToOne.Answer;

public class HqlExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Configuration configuration = new Configuration();
		configuration.configure("hibernate.cfg.xml");
		SessionFactory sessionFactory = configuration.buildSessionFactory();
		Session openSession = sessionFactory.openSession();
		String query = "from Answer";
		
		Query createQuery = openSession.createQuery(query);
		
		List<Answer> list = createQuery.list();
		
		for(Answer ob:list) {
			System.out.println(ob.getAnswer());
		}
		
//		list.forEach(p->{System.out.println(p.getAnswer());});
		
		
//		sessionFactory.close();
	}

}
