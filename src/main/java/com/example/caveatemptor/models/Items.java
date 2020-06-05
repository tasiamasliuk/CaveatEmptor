package com.example.caveatemptor.models;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.Date;

@Entity
public class Items {

    @ManyToOne
    @JoinColumn(name = "idCategory", nullable = false)
    private Category category;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idItems;
    private String name;
    private BigDecimal initialPrice;
    private Date auctionEnd;

    protected Items(){}

    public Items(String name, BigDecimal initialPrice, Date auctionEnd) {
        this.name = name;
        this.initialPrice = initialPrice;
        this.auctionEnd = auctionEnd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
