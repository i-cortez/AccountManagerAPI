package com.user.UserAccountData.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.user.UserAccountData.dto.AddressDTO;
import com.user.UserAccountData.entity.Address;
import com.user.UserAccountData.exception.UserAccountDataException;
import com.user.UserAccountData.repository.UserAddressRepository;

@Service(value = "userAddressService")
@Transactional
public class UserAddressServiceImpl implements UserAddressService {
    @Autowired
    private UserAddressRepository userAddressRepository;

    @Override
    public void updateAddress(Integer addressId, AddressDTO addressDTO)
    throws UserAccountDataException {
        Optional<Address> optional = userAddressRepository.findById(addressId);
        Address address = optional.orElseThrow(
            () -> new UserAccountDataException("Service.ADDRESS_NOT_FOUND")
        );

        address.setStreet(addressDTO.getStreet());
        address.setStreet2(addressDTO.getStreet2());
        address.setCity(addressDTO.getCity());
        address.setState(addressDTO.getState());
        address.setZip(addressDTO.getZip());

        return;
    } 
}
