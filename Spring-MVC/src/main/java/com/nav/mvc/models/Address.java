package com.nav.mvc.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Data;

@Data
@Entity
public class Address {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer addressId;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String postCode;
	private String state;
	private String phoneNumber;
	private String email;
	
	@ManyToOne
	private Person person;

}
