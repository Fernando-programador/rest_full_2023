package com.br.fsc.valueObject_v2;

import java.io.Serializable;
import java.util.Date;
import java.util.Objects;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


public class PersonVO_v2 implements Serializable {

	private static final long serialVersionUID = 1L;
	
	
	private Long id;
	
	private String firstName;
	
	private String lastName;
	
	private Date birthDay;

	private String address;

	private String gender;

	public PersonVO_v2() {
	}



	public PersonVO_v2(Long id, String firstName, String lastName, Date birthDay, String address, String gender) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.birthDay = birthDay;
		this.address = address;
		this.gender = gender;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getAddress() {
		return address;
	}

	public Date getBirthDay() {
		return birthDay;
	}



	public void setBirthDay(Date birthDay) {
		this.birthDay = birthDay;
	}



	public void setAddress(String address) {
		this.address = address;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}



	@Override
	public int hashCode() {
		return Objects.hash(address, birthDay, firstName, gender, id, lastName);
	}



	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		PersonVO_v2 other = (PersonVO_v2) obj;
		return Objects.equals(address, other.address) && Objects.equals(birthDay, other.birthDay)
				&& Objects.equals(firstName, other.firstName) && Objects.equals(gender, other.gender)
				&& Objects.equals(id, other.id) && Objects.equals(lastName, other.lastName);
	}

	
	

}
