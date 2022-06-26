package com.google.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.google.entity.Address;

public interface AddressRepository extends JpaRepository<Address, Integer> {

}
