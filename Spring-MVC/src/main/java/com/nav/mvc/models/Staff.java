package com.nav.mvc.models;


	import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

	@Data
	@NoArgsConstructor
	@AllArgsConstructor
	@Entity
	@DiscriminatorValue("Staff")
	public class Staff extends Person{
		
		@GeneratedValue(strategy=GenerationType.AUTO)
		private Integer empNumber;
		
		/*
		 * @OneToOne(fetch=FetchType.LAZY, mappedBy="passport") private Course course;
		 */
		
		


	}

