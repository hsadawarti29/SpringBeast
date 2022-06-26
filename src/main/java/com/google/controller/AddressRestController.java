package com.google.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.entity.Address;
import com.google.service.AddressService;

@RestController
public class AddressRestController {

	@Autowired
	private AddressService addressService;
	
	public List<Address> saveAddresses(@RequestBody List<Address> addresses){
		return addressService.saveAddresses(addresses);
	}
	
	public List<Address> getAllAddress(){
		return addressService.getAddresses();
	}
}
