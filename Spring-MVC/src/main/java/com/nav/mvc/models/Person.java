package com.nav.mvc.models;

import java.util.Date;
import java.util.List;

import jakarta.persistence.DiscriminatorColumn;
import jakarta.persistence.DiscriminatorType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.OneToMany;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@NoArgsConstructor
@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="role", 
discriminatorType = DiscriminatorType.STRING)
public class Person {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer personId;
	
	private String name;
	private String fatherName;
	private String motherName;
	private Date dob;
	
	@OneToMany(mappedBy="person")
	private List<Address> lstAddr;
	

}
