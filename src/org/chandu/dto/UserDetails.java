package org.chandu.dto;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.annotations.CollectionId;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;


@Entity 
@Table (name = "USER_DETAILS")
public class UserDetails {
	
	
	/*@Transient -- to avoid a field to store i db
	 * @Temporal(@TemporalType.Date) -- only save data
	 * @Temporal(@TemporalType.TIme) -- only save time
	 * @Lob -- more data
	 * 
	 * @EmbeddedID--used when primary key is embeddobject
	 */
	
	@Id @GeneratedValue(strategy = GenerationType.AUTO)
	@Column(name = "USER_ID")
	private int userID;
	@Column(name = "USER_NAME")
	private String userName;
	
	@Lob
	private String description;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date joinedDate ;
	
	@ElementCollection(fetch = FetchType.LAZY )
	@JoinTable(name="USER_ADDRESS",joinColumns = @JoinColumn(name ="USER_ID"))	
	//@GenericGenerator(name="hileo-gen",strategy="increment")
	//@CollectionId(columns = { @Column(name="ADDRESS_ID") }, generator = "hileo-gen", type = @Type(type="long"))
	private Collection<Address> listOfAddress = new ArrayList();
	
	/*
	@Embedded
	private Address address ;
	
	@Embedded
	@AttributeOverrides({
		
		@AttributeOverride(name="city",column=@Column(name="home_city")),
		@AttributeOverride(name="pincode",column=@Column(name="home_pincode")),
		@AttributeOverride(name="street",column=@Column(name="home_street")),
		@AttributeOverride(name="state",column=@Column(name="home_state")),
		
	})
	private Address Homeaddress ;
	*/
	
	
	
	
	/*
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	
	public Address getHomeaddress() {
		return Homeaddress;
	}
	public void setHomeaddress(Address homeaddress) {
		Homeaddress = homeaddress;
	}
	*/
	public Collection<Address> getListOfAddress() {
		return listOfAddress;
	}

	public void setListOfAddress(Collection<Address> listOfAddress) {
		this.listOfAddress = listOfAddress;
	}
		
	public String getDescription() {
		return description;
	}
	
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	public Date getJoinedDate() {
		return joinedDate;
	}
	public void setJoinedDate(Date joinedDate) {
		this.joinedDate = joinedDate;
	}
	//@Id
	//@Column(name = "USER_ID")
	public int getUserID() {
		return userID;
	}
	public void setUserID(int userID) {
		this.userID = userID;
	}
	
	//@Column(name = "USER_NAME")
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	
	

}
