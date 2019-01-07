/**
 * 
 */
package org.cha.dto;

import java.util.*;

import javax.persistence.*;

/**
 * @author Personal
 *
 */
@Entity
public class Person {
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	private int personId;
	
	private String name;
	
	/*
	// one to one relation
	@OneToOne (cascade = {CascadeType.ALL})
	@JoinColumn(name = "VEHICLE_ID")
	private Vehicle vehicle;
	*/
     
	
	//@OneToMany(cascade = {CascadeType.ALL})
	//@JoinTable(name = "Person_Vehicle" , joinColumns = @JoinColumn(name = "person_ID") , inverseJoinColumns = @JoinColumn(name = "vehicle_ID") )
	@OneToMany(cascade = {CascadeType.ALL},mappedBy="person")
	private Set<Vehicle> vehicles = new HashSet();
	
	
	/*
	@ManyToMany(cascade = {CascadeType.ALL})
	@JoinTable(name = "Person_Vehicle" , joinColumns = @JoinColumn(name = "person_ID") , inverseJoinColumns = @JoinColumn(name = "vehicle_ID") )
	private Set<Vehicle> vehicles = new HashSet();
	*/
	

	public Set<Vehicle> getVehicles() {
		return vehicles;
	}

	public void setVehicles(Set<Vehicle> vehicles) {
		this.vehicles = vehicles;
	}

	public int getPersonId() {
		return personId;
	}

	public void setPersonId(int personId) {
		this.personId = personId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	/*
	 // one to one relation

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	*/
	
	
	
	
	


}
