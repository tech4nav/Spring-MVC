package com.nav.mvc.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nav.mvc.models.App_Role;
import com.nav.mvc.repositories.MasterAppRoleRepository;

import jakarta.transaction.Transactional;

@Service
public class MasterDataServices {
	
@Autowired 
private MasterAppRoleRepository masterAppRoleRepository;
	
public List<App_Role> listAllRoles(){
	
	ArrayList<App_Role> role=(ArrayList<App_Role>) masterAppRoleRepository.findAll();
	return role;
}

public App_Role addNewRole(App_Role role)
{
	return masterAppRoleRepository.save(role);
}

public App_Role findRole(Integer id)
{
	Optional<App_Role> role=masterAppRoleRepository.findById(id);
	return role.get();
}

@Transactional
public App_Role updateRole(Integer id)
{
	Optional<App_Role> role=masterAppRoleRepository.findById(id);
	masterAppRoleRepository.updateRoleById(role.get().getRoleName(),role.get().getRoleDescription(),id);
	return masterAppRoleRepository.findById(id).get();
}

public void deleteRole(Integer id)
{
	masterAppRoleRepository.deleteById(id);
}

}
