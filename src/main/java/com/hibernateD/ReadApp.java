package com.hibernateD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernateD.entities.Song;

public class ReadApp {

	public static void main(String[] args) {
		
		SessionFactory sessionFactory = DeleteApp.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		Song song = session.load(Song.class, 3);
		
		System.out.println(song);
	}

}
