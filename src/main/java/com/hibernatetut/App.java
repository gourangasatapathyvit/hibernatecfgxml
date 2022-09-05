package com.hibernatetut;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class App {
	public static void main(String[] args) {
		System.out.println("code started");

		Student student = new Student();
		student.setNum(1);
		student.setName("polo satapathy");

		System.out.println(student);

		SessionFactory sessionFactory = new Configuration().configure("hibernate.cfg.xml")
				.addAnnotatedClass(Student.class).buildSessionFactory();

		Session session = sessionFactory.openSession();
		Transaction tx = session.beginTransaction();
		session.save(student);
		session.getTransaction().commit();
		session.close();

	}
}
