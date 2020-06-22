package com.example.caveatemptor.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Bid {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long idBid;
    private BigDecimal amount;
    private Date createdOn;

    //TODO connection Item-Bid
    @ManyToOne
    @JoinColumn(name="idItem", nullable = false)
    private Item item;

    //TODO connection User-Bid
    @ManyToOne
    @JoinColumn(name="idBidder", nullable = false)
    private User bidder;

    protected Bid(){}

    public Bid(BigDecimal amount, Date createdOn) {
        this.amount = amount;
        this.createdOn = createdOn;
    }

    public Bid(BigDecimal amount, Date createdOn, Item item, User bidder) {
        this.amount = amount;
        this.createdOn = createdOn;
        this.item = item;
        this.bidder = bidder;
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
