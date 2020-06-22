package com.example.caveatemptor.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class CreditCard extends BillingDetails{

    private static final long serialVersionUID = 1L;

    //@Id
    //@GeneratedValue(strategy = GenerationType.AUTO)
    //private Long idCreditCard;
    private String number;
    private String expMonth;
    private String expYear;

    protected CreditCard(){}

    public CreditCard(String number, String expMonth, String expYear, User user) {
        this.owner = user;
        this.number = number;
        this.expMonth = expMonth;
        this.expYear = expYear;
    }



    public String getNumber() {
        return number;
    }

    public String getExpMonth() {
        return expMonth;
    }

    public String getExpYear() {
        return expYear;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setExpMonth(String expMonth) {
        this.expMonth = expMonth;
    }

    public void setExpYear(String expYear) {
        this.expYear = expYear;
    }


}
