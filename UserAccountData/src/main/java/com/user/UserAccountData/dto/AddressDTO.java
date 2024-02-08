package com.user.UserAccountData.dto;

import com.user.UserAccountData.entity.Address;

public class AddressDTO {
    private Integer addressId;
    private String street;
    private String street2;
    private String city;
    private String state;
    private Integer zip;

    public Integer getAddressId() {
        return this.addressId;
    }
    public void setAddressId(Integer addressId) {
        this.addressId = addressId;
    }

    public String getStreet() {
        return this.street;
    }
    public void setStreet(String street) {
        this.street = street;
    }

    public String getStreet2() {
        return this.street2;
    }
    public void setStreet2(String street2) {
        this.street2 = street2;
    }

    public String getCity() {
        return this.city;
    }
    public void setCity(String city) {
        this.city = city;
    }

    public String getState() {
        return this.state;
    }
    public void setState(String state) {
        this.state = state;
    }

    public Integer getZip() {
        return this.zip;
    }
    public void setZip(Integer zip) {
        this.zip = zip;
    }

    public static AddressDTO entityToDto(Address address) {
        AddressDTO addressDTO = new AddressDTO();
        addressDTO.setAddressId(address.getAddressId());
        addressDTO.setStreet(address.getStreet());
        addressDTO.setStreet2(address.getStreet2());
        addressDTO.setCity(address.getCity());
        addressDTO.setState(address.getState());
        addressDTO.setZip(address.getZip());

        return addressDTO;
    }

    @Override
    public String toString() {
        return "AddressDTO [addressId=" + this.addressId + ", street=" + 
        this.street + ", street2=" + this.street2 + ", city=" + this.city + 
        ", state=" + this.state + ", zip=" + this.zip + "]";
    }
}
