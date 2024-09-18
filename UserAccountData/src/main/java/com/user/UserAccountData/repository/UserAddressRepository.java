package com.user.UserAccountData.repository;

import org.springframework.data.repository.CrudRepository;

import com.user.UserAccountData.entity.Address;

public interface UserAddressRepository extends CrudRepository<Address, Integer>{

}
