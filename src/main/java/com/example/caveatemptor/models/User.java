package com.example.caveatemptor.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class User {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long idUser;
    private String nameUser;
    private String firstName;
    private String lastName;


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
}
