package com.google.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.google.entity.Address;
import com.google.repository.AddressRepository;

@Service
public class AddressService {

	@Autowired
	private AddressRepository addressRepository;
	
	public List<Address> saveAddresses(List<Address> addresses){
		return addressRepository.saveAll(addresses);
	}
	
	public List<Address> getAddresses(){
		return addressRepository.findAll();
	}
}
