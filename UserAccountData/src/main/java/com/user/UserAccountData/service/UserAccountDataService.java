package com.user.UserAccountData.service;

import com.user.UserAccountData.dto.UserDTO;
import com.user.UserAccountData.exception.UserAccountDataException;

public interface UserAccountDataService {
    public Integer addUser(UserDTO userDTO) throws UserAccountDataException;
    public UserDTO getUserByUserId(Integer userId) throws UserAccountDataException;
    public UserDTO updateUser(Integer userId, UserDTO userDTO) throws UserAccountDataException;
    public void deleteUser(Integer userId) throws UserAccountDataException;
}
