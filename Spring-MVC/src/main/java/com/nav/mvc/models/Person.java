package com.nav.mvc.models;

import java.util.Date;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Person {
	
	private Integer personId;
	private String name;
	private String fatherName;
	private String motherName;
	private Date dob;
	private String role;
	

}
