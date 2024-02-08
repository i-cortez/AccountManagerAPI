package com.user.UserAccountData.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.user.UserAccountData.entity.User;

public interface UserAccountDataRepository extends CrudRepository<User, Integer> {
    public List<User> findByUserName(String userName);
}
