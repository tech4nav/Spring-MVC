package com.nav.mvc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nav.mvc.models.Address;
import com.nav.mvc.models.Staff;
import com.nav.mvc.models.Student;
import com.nav.mvc.repositories.AddressRepository;
import com.nav.mvc.repositories.StaffRepository;

@Service
public class StaffService {
	@Autowired
	private StaffRepository staffRepository;
	@Autowired
	private AddressRepository addressRepository;

	public List<Staff> listAllStaff() {
		// TODO Auto-generated method stub
		return (List<Staff>) staffRepository.findAll();
	}

	public void addNewStaff(Staff staff) {
		Staff std=staffRepository.save(staff);
		Address adr=std.getLstAddr().get(0);
		adr.setPerson(staff);
		addressRepository.save(adr);
	}

}
