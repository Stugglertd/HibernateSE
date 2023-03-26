package com.hibernateD;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.hibernateD.entities.Song;

public class CreateApp 
{
    public static void main( String[] args )
    {
    	
    	
    	SessionFactory sessionFactory = DeleteApp.getSessionFactory();
    	
    	Session session = sessionFactory.openSession();
    	
        Song song1 = new Song();
        song1.setId(3);
        song1.setSongName("Kal ho na ho");
        song1.setArtist("Sonu N");
        
        session.beginTransaction();
        session.save(song1);
        session.getTransaction().commit();
        
        System.out.println("Song saved check db..");
    }
}
