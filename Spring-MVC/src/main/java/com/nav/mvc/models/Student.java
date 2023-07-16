package com.nav.mvc.models;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.OneToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity
@DiscriminatorValue("Student")
public class Student extends Person{
	
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer registrationNumber;
	
	/*
	 * @OneToOne(fetch=FetchType.LAZY, mappedBy="passport") private Course course;
	 */
	
	


}
