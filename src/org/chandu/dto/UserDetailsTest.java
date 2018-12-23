package org.chandu.dto;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserDetailsTest {

	public static void main(String[] args) {
		
		UserDetails u = new UserDetails();
		u.setUserID(1);
		u.setUserName("Chandu");
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s =  sf.openSession();
		s.beginTransaction();
		s.save(u);
		s.getTransaction().commit();

	}

}
