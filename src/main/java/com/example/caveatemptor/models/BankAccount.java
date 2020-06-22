package com.example.caveatemptor.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class BankAccount extends BillingDetails{

    private static final long serialVersionUID = 1L;

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private Long idBankAccount;
    private String account;
    private String bankName;
    private String swift;

    protected BankAccount(){}

    public BankAccount(String account, String bankName, String swift, User user) {
        this.account = account;
        this.bankName = bankName;
        this.swift = swift;
        this.owner = user;
    }

    public String getAccount() {
        return account;
    }

    public String getBankName() {
        return bankName;
    }

    public String getSwift() {
        return swift;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public void setSwift(String swift) {
        this.swift = swift;
    }
}
