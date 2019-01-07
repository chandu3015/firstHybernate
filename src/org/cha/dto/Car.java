package org.cha.dto;

import javax.persistence.*;

/*
 * @DiscriminatorValue("Car-4Weel")--used for single-table strategy
 * 
 * 
 */

@Entity

public class Car extends Vehicle {
	
	private String carMode ;

	public String getCarMode() {
		return carMode;
	}

	public void setCarMode(String carMode) {
		this.carMode = carMode;
	}
	
	

}
