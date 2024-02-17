package com.user.UserAccountData.entity;

import com.user.UserAccountData.dto.AddressDTO;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer addressId;
    private String street;
    @Column(name = "street_2")
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

    public static Address dtoToEntity(AddressDTO addressDTO) {
        Address address = new Address();
        address.setStreet(addressDTO.getStreet());
        address.setStreet2(addressDTO.getStreet2());
        address.setCity(addressDTO.getCity());
        address.setState(addressDTO.getState());
        address.setZip(addressDTO.getZip());
        return address;
    }

    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + (
            (this.addressId == null) ? 0 : this.addressId.hashCode()
        );

        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(obj == null) return false;
        if(this.getClass() != obj.getClass()) return false;

        Address other = (Address) obj;
        if(this.addressId == null) {
            if(other.addressId != null) return false;
        }
        else if(!this.addressId.equals(other.addressId)) return false;

        return true;
    }
}
