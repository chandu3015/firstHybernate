package org.chandu.dto;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class UserDetailsTest {

	public static void main(String[] args) {
		
		Address a = new Address();
		a.setCity("houston");
		a.setPincode("12345");
		a.setState("TX");
		a.setStreet("ivy");
		
		
		Address a1 = new Address();
		a1.setCity("vij");
		a1.setPincode("34335");
		a1.setState("irving");
		a1.setStreet("mooty");
		
		
		
		UserDetails u = new UserDetails();
		//u.setUserID(1);
		u.getListOfAddress().add(a);
		u.getListOfAddress().add(a1);
		u.setUserName("Chandu");
		//u.setListOfAddress(a);
		//u.setHomeaddress(a);
		u.setDescription("I am who am I");
		u.setJoinedDate(new Date());
		
		
		
		UserDetails u2 = new UserDetails();
		u2.getListOfAddress().add(a);
		u2.getListOfAddress().add(a1);
		//u2.setUserID(2);
		u2.setUserName("Harsha");
		//u2.setAddress(a);
		//u2.setHomeaddress(a);
		u2.setDescription("I am Harsha who am I");
		u2.setJoinedDate(new Date());
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s =  sf.openSession();
		s.beginTransaction();
		s.save(u);
		s.save(u2);
		s.getTransaction().commit();
		s.close();
		
		u = null;
		s=sf.openSession();
		//s.beginTransaction();
		u=(UserDetails)s.get(UserDetails.class, 1);
		System.out.println(u.getUserName());
		System.out.println(u.getListOfAddress().size());
		//s.getTransaction().commit();
		s.close();
		System.out.println(u.getListOfAddress().size());
		

	}

}
