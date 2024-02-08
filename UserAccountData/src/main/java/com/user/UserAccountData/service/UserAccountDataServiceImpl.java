package com.user.UserAccountData.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.user.UserAccountData.dto.UserDTO;
import com.user.UserAccountData.entity.User;
import com.user.UserAccountData.exception.UserAccountDataException;
import com.user.UserAccountData.repository.UserAccountDataRepository;
import com.user.UserAccountData.validator.Validator;

@Service(value = "userAccountDataService")
@Transactional
public class UserAccountDataServiceImpl implements UserAccountDataService {
    @Autowired
    private UserAccountDataRepository userAccountDataRepository;

    @Override
    public Integer addUser(UserDTO userDTO) throws UserAccountDataException {
        Validator.validate(userDTO);
        User user = User.dtoToEntity(userDTO);
        userAccountDataRepository.save(user);

        return user.getUserId();
    }

    @Override
    public List<UserDTO> getDetailsByUserName(String userName) 
    throws UserAccountDataException {
        List<User> users = userAccountDataRepository.findByUserName(userName);

        if(users.isEmpty()) {
            throw new UserAccountDataException("Service.NO_USERS_FOUND");
        }

        List<UserDTO> userDTOs = new ArrayList<>();
        users.forEach(
            user -> {
                UserDTO userDTO = UserDTO.entityToDto(user);
                userDTOs.add(userDTO);
            }
        );

        return userDTOs;
    }
}
