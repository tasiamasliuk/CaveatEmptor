package com.example.caveatemptor.models;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idBid;
    private BigDecimal amount;
    private Date createdOn;

    protected Bid(){}

    public Bid(BigDecimal amount, Date createdOn) {
        this.amount = amount;
        this.createdOn = createdOn;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }
}
