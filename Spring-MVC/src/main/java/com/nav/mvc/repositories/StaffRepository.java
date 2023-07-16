package com.nav.mvc.repositories;

import org.springframework.data.repository.CrudRepository;

import com.nav.mvc.models.Staff;

public interface StaffRepository  extends CrudRepository<Staff, Integer> {

}
