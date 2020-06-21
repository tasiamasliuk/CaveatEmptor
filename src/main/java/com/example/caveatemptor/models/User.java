package com.example.caveatemptor.models;

import javax.persistence.*;
import java.util.Set;

/*
 * User - A user can be a seller or a buyer.    //TODO don't use
 * Name - A value type that represents firstName and lastName. //TODO don't use
 * Sellers - One seller can have multiple selling items.    //TODO don't use
 * Buyers - One buyer can have multiple bids on different items. //TODO don't use
 * Address- A user can have multiple addresses with types BILLING, SHIPPING //TODO and home.
 * Billing details - A user can have multiple billing details of types BankAccount and CreditCard.
*/

@Entity

/*@NamedQuery(name = "User.findByUserName",
        query = "select u from user u where u.name_user = ?1")*/
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idUser;
    private String nameUser;
    private String firstName;
    private String lastName;

    //User - A user can be a seller or a buyer.
    public enum UserType{ SELLER, BUYER, ADMIN}
    @Enumerated(EnumType.STRING)
    private UserType userType;

    //connection Item - User
    @OneToMany(mappedBy="seller")
    private Set<Item> sellingItemsSet;
    //connection Bid - User
    @OneToMany(mappedBy="bidder")
    private Set<Bid> bidSet;
    //connection Address - User
    @OneToMany(mappedBy="user")
    private Set<Address> addressSet;


    @OneToMany(mappedBy = "owner")
    private Set<BankAccount> bankAccountSet;
    @OneToMany(mappedBy = "owner")
    private Set<CreditCard> creditCardSet;

    protected User(){}

    public User(String nameUser, String firstName, String lastName) {
        this.nameUser = nameUser;
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public User(String nameUser, String firstName, String lastName, UserType userType) {
        this.nameUser = nameUser;
        this.firstName = firstName;
        this.lastName = lastName;
        this.userType = userType;
    }

    public Long getIdUser() {
        return idUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Set<Item> getSellingItemsSet() {
        return sellingItemsSet;
    }

    public void setSellingItemsSet(Set<Item> sellingItemsSet) {
        this.sellingItemsSet = sellingItemsSet;
    }

    public Set<Bid> getBidSet() {
        return bidSet;
    }

    public void setBidSet(Set<Bid> bidSet) {
        this.bidSet = bidSet;
    }

    public Set<Address> getAddressSet() {
        return addressSet;
    }

    public void setAddressSet(Set<Address> addressSet) {
        this.addressSet = addressSet;
    }

    public Set<BankAccount> getBankAccountSet() {
        return bankAccountSet;
    }

    public void setBankAccountSet(Set<BankAccount> bankAccountSet) {
        this.bankAccountSet = bankAccountSet;
    }

    public Set<CreditCard> getCreditCardSet() {
        return creditCardSet;
    }

    public void setCreditCardSet(Set<CreditCard> creditCardSet) {
        this.creditCardSet = creditCardSet;
    }

    @Override
    public String toString() {
        return "User name: " + nameUser + " First name: " + firstName + " Last name: " + lastName;
    }
}
