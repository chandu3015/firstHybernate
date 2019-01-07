package com.chae.dto;

import javax.persistence.*;

@Entity
@NamedQuery(name="aQuerry",query="from Owner where ownerID > ?0")
@NamedNativeQuery(name = "bQuerry", query = "select * from Owner where ownerid > ?0",resultClass=Owner.class)
public class Owner {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int ownerID;
	private String Name;
	
	public Owner()
	{
		
	}
	
	public Owner(String name)
	{
		this.Name=name;
	}
	public int getOwnerID() {
		return ownerID;
	}
	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	
	

}
