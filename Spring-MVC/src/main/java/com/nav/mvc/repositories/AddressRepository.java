package com.nav.mvc.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nav.mvc.models.Address;

public interface AddressRepository   extends CrudRepository<Address, Integer> {

}
