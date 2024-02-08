package com.user.UserAccountData.entity;

import com.user.UserAccountData.dto.UserDTO;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name = "userdata")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;
    private String firstName;
    private String lastName;
    private String userName;
    private String email;
    private String password;
    private Long phoneNumber;
    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "address_id", unique = true)
    private Address address;

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

    public String getUserName() {
        return this.userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
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

    public Address getAddress() {
        return this.address;
    }
    public void setAddress(Address address) {
        this.address = address;
    }

    public static User dtoToEntity(UserDTO userDTO){
        User user = new User();
        user.setFirstName(userDTO.getFirstName());
        user.setLastName(userDTO.getLastName());
        user.setUserName(userDTO.getUserName());
        user.setEmail(userDTO.getEmail());
        user.setPassword(userDTO.getPassword());
        user.setPhoneNumber(userDTO.getPhoneNumber());
        Address address = Address.dtoToEntity(userDTO.getAddressDTO());
        user.setAddress(address);

        return user;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (
            (this.userId == null) ? 0 : this.userId.hashCode()
        );

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;

        User other = (User) obj;
        if(this.userId == null) {
            if(other.userId != null) return false;
        }
        else if(!this.userId.equals(other.userId)) return false;

        return true;
    }

}
