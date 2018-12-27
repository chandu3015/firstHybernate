/**
 * 
 */
package org.cha.dto;

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
	
	@OneToOne @JoinColumn(name = "VEHICLE_ID")
	private Vehicle vehicle;

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

	public Vehicle getVehicle() {
		return vehicle;
	}

	public void setVehicle(Vehicle vehicle) {
		this.vehicle = vehicle;
	}
	
	
	
	
	
	


}
