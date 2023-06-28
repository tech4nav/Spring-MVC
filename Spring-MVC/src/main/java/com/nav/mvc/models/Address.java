package com.nav.mvc.models;

import lombok.Data;

@Data
public class Address {
	
	private Integer addressId;
	private String addressLine1;
	private String addressLine2;
	private String city;
	private String postCode;
	private String state;
	private String phoneNumber;
	private String email;
	private Person person;

}
