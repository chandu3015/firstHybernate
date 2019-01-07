package com.chae.dto;

import java.util.*;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;

public class OwnerTest {

	public static void main(String[] args) {
		
		/*
		 //CURD OPERATION Begins
		
		Owner o ;
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		
		//Insertion
		Session s = sf.openSession();
		s.beginTransaction();		
		for(int i=1;i<=10;i++)
		{
			o =  new Owner("Owner"+i);
			s.save(o);
		}
		s.getTransaction().commit();		
		s.close();
		
		//Reading
		s=sf.openSession();
		s.beginTransaction();
		o= s.get(Owner.class, 2);
		System.out.println("owner retrived is:"+o.getName());
		           //update
				 //o.setName("chandu");
		          //delete
		       // s.delete(o);
		        
		
		s.getTransaction().commit();
		s.close();
		
		//CURD OPERATION Ends
		*/
		
		
		/*
		//Qery Begins
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		//Query q = s.createQuery("select Name from Owner where ownerID > ?0");
		Query q = s.getNamedQuery("aQuerry");
		//Query q = s.getNamedQuery("bQuerry");
		q.setInteger(0, 5);
		q.setFirstResult(2);
		q.setMaxResults(2);
		
								/*
								List<String> l=(List<String>)q.list();
								
								System.out.println("Size Of list "+l.size());
								for(String a : l)
								{
									System.out.println(a);
								}
		                       */
		/*
		List<Owner> l=(List<Owner>)q.list();
		
		System.out.println("Size Of list "+l.size());
		for(Owner a : l)
		{
			System.out.println(a.getName());
		}
		
		s.getTransaction().commit();
		s.close();
		
		*/
		
		
		///*
		
		//Criteria Begins
		
		SessionFactory sf = new Configuration().configure().buildSessionFactory();
		Session s = sf.openSession();
		s.beginTransaction();
		
		Criteria c = s.createCriteria(Owner.class);
		c.add(Restrictions.eq("ownerID", 6));
		
		List<Owner> l = (List<Owner>)c.list();
		 for(Owner o : l)
		 {
			 System.out.println("Owner Name is : "+o.getName());
		 }
		 
		 
		 s.getTransaction().commit();
		 s.close();
		 
		 //*/

	}

}
