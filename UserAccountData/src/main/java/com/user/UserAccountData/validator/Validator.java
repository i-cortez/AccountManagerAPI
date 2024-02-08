package com.user.UserAccountData.validator;

import com.user.UserAccountData.dto.UserDTO;
import com.user.UserAccountData.exception.UserAccountDataException;

public class Validator {
    public static void validate(UserDTO userDTO) throws UserAccountDataException {
        if(Boolean.FALSE.equals(validatePassword(userDTO.getPassword()))) {
            throw new UserAccountDataException("Validator.INVALID_PASSWORD");
        }
    }

    private static Boolean validatePassword(String password) {
        return (password.matches("[A-Za-z0-9]{10}"));
    }
}
