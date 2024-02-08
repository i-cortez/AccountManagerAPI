package com.user.UserAccountData.service;

import java.util.List;

import com.user.UserAccountData.dto.UserDTO;
import com.user.UserAccountData.exception.UserAccountDataException;

public interface UserAccountDataService {
    public Integer addUser(UserDTO userDTO) throws UserAccountDataException;
    public List<UserDTO> getDetailsByUserName(String userName) throws UserAccountDataException;
}
