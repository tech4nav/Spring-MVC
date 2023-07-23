package com.nav.mvc.repositories;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.nav.mvc.models.App_Role;

import jakarta.transaction.Transactional;

public interface MasterAppRoleRepository  extends CrudRepository<App_Role, Integer>{

	
	
	  @Modifying
	  
	  @Transactional
	  
	  @Query("update App_Role u set u.roleName = ?1, u.roleDescription = ?2 where u.id = ?3"
	  ) void updateRoleById(String roleName, String roleDescription, Integer id);
	 
}
