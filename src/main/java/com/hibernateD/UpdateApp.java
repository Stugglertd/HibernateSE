package com.hibernateD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernateD.entities.Song;

public class UpdateApp {

	public static void main(String[] args) {
	  
	  SessionFactory sessionFactory = DeleteApp.getSessionFactory();
	  Session session = sessionFactory.openSession();
	  
	  Song song = session.get(Song.class,2);
	
	  song.setSongName("BELIEVER");
	
	  session.beginTransaction();
	  session.update(song);
	  session.getTransaction().commit();
	  
	}

}
