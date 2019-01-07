package org.cha.dto;

import java.util.*;

import javax.persistence.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.*;

/*
 * @DiscriminatorColumn(name= "discriminator_TYPE",discriminatorType = DiscriminatorType.STRING) //--used in single table stragey
 * 
 */

@Entity
@Inheritance(strategy=InheritanceType.JOINED)

public class Vehicle {

	@Id @GeneratedValue(strategy=GenerationType.SEQUENCE)
	private int vehicleID;
	
	private String vehicleName;
	
	/*
	//ManyToMany
	@ManyToMany(cascade = {CascadeType.ALL}, mappedBy = "vehicles")
	private Set<Person> persons = new HashSet();
	*/

	
	
	
	//Not required for ONe-to- One
	@ManyToOne(cascade = {CascadeType.ALL})
	@JoinTable(name = "Vehicle_Person" , joinColumns = @JoinColumn(name = "vehicle_ID") , inverseJoinColumns = @JoinColumn(name = "person_ID") )
	private Person person;
	
	
	
	

	// seeters geeters not required for person in one-one case
	public Person getPerson() {
		return person;
	}

	public void setPerson(Person person) {
		this.person = person;
	}
	
	
	
	
	
	
	/*
	//ManyToMany
  
	public Set<Person> getPersons() {
		return persons;
	}

	public void setPersons(Set<Person> persons) {
		this.persons = persons;
	}
	
	*/
	
	

	public int getVehicleID() {
		return vehicleID;
	}

	public void setVehicleID(int vehicleID) {
		this.vehicleID = vehicleID;
	}

	public String getVehicleName() {
		return vehicleName;
	}

	public void setVehicleName(String vehicleName) {
		this.vehicleName = vehicleName;
	}
	
	
	
}
