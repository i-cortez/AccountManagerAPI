package com.user.UserAccountData.service;

import java.util.Optional;

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
    public UserDTO getUserByUserId(Integer userId) 
    throws UserAccountDataException {
        Optional<User> optional = userAccountDataRepository.findById(userId);
        User user = optional.orElseThrow(
            () -> new UserAccountDataException("Service.USER_ID_NOT_FOUND")
        );

        UserDTO userDTO = UserDTO.entityToDto(user);

        return userDTO;
    }
}
