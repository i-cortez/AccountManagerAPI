package com.user.UserAccountData.repository;

import org.springframework.data.repository.CrudRepository;

import com.user.UserAccountData.entity.User;

public interface UserAccountDataRepository extends CrudRepository<User, Integer> {
    
}
