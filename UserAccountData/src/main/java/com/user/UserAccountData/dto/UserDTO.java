package com.user.UserAccountData.dto;

import com.user.UserAccountData.entity.User;

public class UserDTO {
    private Integer userId;
    private String firstName;
    private String lastName;
    private String email;
    private String password;
    private Long phoneNumber;
    private AddressDTO addressDTO;


    public Integer getUserId() {
        return this.userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return this.firstName;
    }
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return this.email;
    }
    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    public Long getPhoneNumber() {
        return this.phoneNumber;
    }
    public void setPhoneNumber(Long phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public AddressDTO getAddressDTO() {
        return this.addressDTO;
    }
    public void setAddressDTO(AddressDTO addressDTO) {
        this.addressDTO = addressDTO;
    }

    public static UserDTO entityToDto(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setFirstName(user.getFirstName());
        userDTO.setLastName(user.getLastName());
        userDTO.setEmail(user.getEmail());
        userDTO.setPassword(user.getPassword());
        userDTO.setPhoneNumber(user.getPhoneNumber());
        AddressDTO addressDTO = AddressDTO.entityToDto(user.getAddress());
        userDTO.setAddressDTO(addressDTO);

        return userDTO;
    }

    @Override
    public String toString() {
        return "UserDTO [userId=" + this.userId + ", firstName=" + 
        this.firstName + ", lastName=" + this.lastName + ", email=" + 
        this.email + ", password=" + this.password + ", phoneNumber=" + 
        this.phoneNumber + ", addressDTO" + this.addressDTO + "]";
    }
}
