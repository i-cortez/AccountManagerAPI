package com.user.UserAccountData.dto;

import com.user.UserAccountData.entity.User;

public class UserDTO {
    private Integer userId;
    private String userName;
    private String password;
    private Long phoneNumber;
    private String city;

    public UserDTO() {
        super();
    }

    public UserDTO(
        Integer userId,
        String userName,
        String password,
        Long phoneNumber,
        String city
    ) {
        super();
        this.userId = userId;
        this .userName = userName;
        this.password = password;
        this.phoneNumber = phoneNumber;
        this.city = city;
    }

    public Integer getUserId() {
        return this.userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
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

    public String getCity() {
        return this.city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public static UserDTO entityToDto(User user){
        UserDTO userDTO = new UserDTO();
        userDTO.setUserId(user.getUserId());
        userDTO.setUserName(user.getUserName());
        userDTO.setPassword(user.getPassword());
        userDTO.setPhoneNumber(user.getPhoneNumber());
        userDTO.setCity(user.getCity());

        return userDTO;
    }

    @Override
    public String toString() {
        return "UserDTO [userId=" + this.userId + ",userName=" + this.userName + 
        ", password=" + this.password + ", phoneNumber=" + this.phoneNumber + 
        ", city" + this.city + "]";
    }
}
