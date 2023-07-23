package com.nav.mvc.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@Entity
public class App_Role {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer roleId;
	private String roleName;
	private String roleDescription;

}
