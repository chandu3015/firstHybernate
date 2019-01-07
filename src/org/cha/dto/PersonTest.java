package org.cha.dto;

import org.hibernate.*;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class PersonTest {

	public static void main(String[] args) {
		
		
		Vehicle v = new Vehicle();
		v.setVehicleName("Chandu-Vehicle1");
		
		
		Vehicle v1 = new Vehicle();
		v1.setVehicleName("Chandu Vehicle2");
		
		Car v3 = new Car();
		v3.setCarMode("Accord");
		v3.setVehicleName("Honda");
		
		Bike v4 = new Bike();
		v4.setBikeModel("ZMR");
		v4.setVehicleName("DUKE");
		
		Person p = new Person();
		p.setName("Chandu");
		
		/*
		Person y = new Person();
		y.setName("Yashu");
		*/
		
		p.getVehicles().add(v);
		p.getVehicles().add(v1);
		p.getVehicles().add(v3);
		p.getVehicles().add(v4);
		
		//implementing bi-directional mapping
		v.setPerson(p);
		v1.setPerson(p);
		v3.setPerson(p);
		v4.setPerson(p);
		
		/*
		y.getVehicles().add(v);
		y.getVehicles().add(v1);
		*/
		
		SessionFactory  sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		s.save(p);
		//s.save(y);
		s.getTransaction().commit();
		s.close();
		

	}

}
