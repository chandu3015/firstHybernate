package org.chandu.dto;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity 
@Table (name = "USER_DETAILS")
public class UserDetails {
	
	
	/*@Transient -- to avoid a field to store i db
	 * @Temporal(@TemporalType.Date) -- only save data
	 * @Temporal(@TemporalType.TIme) -- only save time
	 * @Lob -- more data
	 * 
	 * 
	 */
	
	@Id
	@Column(name = "USER_ID")
	private int userID;
	@Column(name = "USER_NAME")
	private String userName;
	
	@Lob
	private String description;
	
	private String address ;
	
	@Temporal(TemporalType.TIMESTAMP)
	private Date joinedDate ;
	
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
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
