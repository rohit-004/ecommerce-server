package com.rohitk.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.rohitk.model.Address;

public interface AddressRepository extends JpaRepository<Address, Long> {

}
