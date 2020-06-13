package com.example.caveatemptor.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Item {

    @ManyToOne
    @JoinColumn(name = "idCategory", nullable = false)
    private Category category;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idItem;
    private String nameItem;
    private BigDecimal initialPrice;
    private Date auctionEnd;

    protected Item(){}

    public Item(String name, BigDecimal initialPrice, Date auctionEnd) {
        this.nameItem = name;
        this.initialPrice = initialPrice;
        this.auctionEnd = auctionEnd;
    }

    public String getNameItem() {
        return nameItem;
    }

    public void setNameItem(String nameItem) {
        this.nameItem = nameItem;
    }

    public BigDecimal getInitialPrice() {
        return initialPrice;
    }

    public void setInitialPrice(BigDecimal initialPrice) {
        this.initialPrice = initialPrice;
    }

    public Date getAuctionEnd() {
        return auctionEnd;
    }

    public void setAuctionEnd(Date auctionEnd) {
        this.auctionEnd = auctionEnd;
    }
}
