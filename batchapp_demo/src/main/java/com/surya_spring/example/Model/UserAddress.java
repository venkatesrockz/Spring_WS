package com.surya_spring.example.Model;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

@Entity
@Table(name = "user_address")
//@JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
public class UserAddress implements Serializable {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = -3570928575182329616L;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="user_id")
	private UserData userdata;
	

	@Id
	@Column(name = "addr_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long addrid;

	@Column(name = "dr_no")
	@NotNull
    private String doorNo;


	@Column(name = "strt_name")
	@NotNull
    private String streetName;
	
	@Column(name = "city")
	@NotNull
    private String city;
	
	@Column(name = "country")
	@NotNull
    private String country;

	/*@OneToOne(cascade=CascadeType.ALL)
	@Column(name="user_id")*/
	public UserData getUserdata() {
		return userdata;
	}

	public void setUserdata(UserData userdata) {
		this.userdata = userdata;
	}

	public Long getAddrid() {
		return addrid;
	}

	public void setAddrid(Long addrid) {
		this.addrid = addrid;
	}

	public String getDoorNo() {
		return doorNo;
	}

	public void setDoorNo(String doorNo) {
		this.doorNo = doorNo;
	}

	public String getStreetName() {
		return streetName;
	}

	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}
	
	
	
}
