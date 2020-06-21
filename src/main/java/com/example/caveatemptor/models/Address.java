package com.example.caveatemptor.models;

import javax.persistence.*;

@Entity
public class Address {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idAddress;
    private String street;
    private String zipcode;
    private String city;

    //User can have multiple addresses with types BILLING, SHIPPING and HOME.
    public enum AddressType{home, billing, shipping}
    @Enumerated(EnumType.STRING)
    private AddressType addressType;

    //TODO connection User - Address
    @ManyToOne
    @JoinColumn(name="idUser", nullable = false)
    private User user;

    protected Address(){}

    public Address(String street, String zipcode, String city, AddressType addressType) {
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
        this.addressType = addressType;
    }

    public Address(String street, String zipcode, String city, AddressType addressType, User user) {
        this.street = street;
        this.zipcode = zipcode;
        this.city = city;
        this.addressType = addressType;
        this.user = user;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public AddressType getAddressType() {
        return addressType;
    }

    public void setAddressType(AddressType addressType) {
        this.addressType = addressType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
