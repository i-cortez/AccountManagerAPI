package com.user.UserAccountData.service;

import com.user.UserAccountData.dto.AddressDTO;
import com.user.UserAccountData.exception.UserAccountDataException;

public interface UserAddressService {
    public void updateAddress(Integer addressId, AddressDTO addressDTO) throws UserAccountDataException;
}
