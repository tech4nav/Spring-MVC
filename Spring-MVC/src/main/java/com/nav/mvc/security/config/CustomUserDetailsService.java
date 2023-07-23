package com.nav.mvc.security.config;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nav.mvc.models.Person;
import com.nav.mvc.repositories.PersonRepository;

@Service
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private PersonRepository personRepository;

    @Override
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
    	Person usr=new Person();
        List<Person> users = personRepository.findByUsername(username);
        if(users ==null || users.isEmpty()) {
            throw new UsernameNotFoundException("User Not Found");
        }else {
        usr=users.get(0);
        }
        return new CustomUserDetails(usr);
    }
}
