package org.cha.dto;

import javax.persistence.*;

/*
 * @DiscriminatorValue("Bike-2Weel")
 * 
 * 
 */

@Entity

public class Bike extends Vehicle{
	
	private String bikeModel;

	public String getBikeModel() {
		return bikeModel;
	}

	public void setBikeModel(String bikeModel) {
		this.bikeModel = bikeModel;
	}
	
	

}
