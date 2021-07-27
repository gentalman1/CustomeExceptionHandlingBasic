package com.customeexception.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "registration")
public class Registration implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;

	private String name;
	private String email;
	private String phoneNo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNo() {
		return phoneNo;
	}

	public void setPhoneNo(String phoneNo) {
		this.phoneNo = phoneNo;
	}

	public static long getSerialversionuid() {
		return serialVersionUID;
	}

	public Registration(String name, String email, String phoneNo) {
		super();
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
	}

	public Registration() {
		super();
	}

	public Registration(Long id, String name, String email, String phoneNo) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.phoneNo = phoneNo;
	}

}
