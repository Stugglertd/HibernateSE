package com.hibernateD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernateD.entities.Song;

public class DeleteApp {

	public static void main(String[] args) {
		  SessionFactory sessionFactory = getSessionFactory();
		  
		  Session session = sessionFactory.openSession();
		  
		  Song song = session.get(Song.class,2);
		  
		  session.beginTransaction();
		  session.delete(song);
		  session.getTransaction().commit();
	}

	public static SessionFactory getSessionFactory() {
		Configuration configuration = new Configuration();
		  configuration.configure();
		  configuration.addAnnotatedClass(Song.class);
		  
		  SessionFactory sessionFactory = configuration.buildSessionFactory();
		return sessionFactory;
	}

}
