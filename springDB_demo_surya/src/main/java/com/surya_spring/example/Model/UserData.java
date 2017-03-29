package com.surya_spring.example.Model;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import lombok.Getter;
import lombok.NonNull;
import lombok.Setter;

@Entity
@Table(name = "user_data")
@Getter @Setter
@JsonSerialize
public class UserData implements Serializable {
	/**
	 * Serialization ID
	 */
	private static final long serialVersionUID = 8133309714576433031L;
	
	@Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "user_id")
	private Long userId;

	@Column(name = "user_name")
	@NonNull
	private String userName;

	@Column(name = "user_email")
	@NonNull
	private String userEmail;
}
