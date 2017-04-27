package com.surya_spring.example.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

import lombok.NonNull;


@XmlRootElement(name="user_data")
@XmlAccessorType(XmlAccessType.NONE)
@Entity
@Table(name = "user_data")
public class UserData implements Serializable{
	/**
	 * Serialization ID
	 */
	private static final long serialVersionUID = 8133309714576433031L;
	
	@Id
	@Column(name = "user_id")
    @GeneratedValue(strategy = GenerationType.AUTO)
	@XmlElement
    private Long userId;

	@Column(name = "user_name")
	@NonNull
	@XmlElement
	private String userName;

	@Column(name = "user_email")
	@NonNull
	@XmlElement
	private String userEmail;
	
	@Column(name="user_age")
	@XmlElement
	private String userage;
	
	

	@XmlAttribute
	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserEmail() {
		return userEmail;
	}

	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
	
	public String getUserage() {
		return userage;
	}

	public void setUserage(String userage) {
		this.userage = userage;
	}

}
