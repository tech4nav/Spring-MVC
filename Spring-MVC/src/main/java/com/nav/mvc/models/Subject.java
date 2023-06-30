package com.nav.mvc.models;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@NoArgsConstructor
public class Subject {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	  private Integer id;

	  private String subjectName;
	  private String subjectDesc;
	  
}
