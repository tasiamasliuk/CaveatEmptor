package com.example.caveatemptor.models;

import javax.persistence.*;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Date;
import java.util.Set;

@Entity
public class Item implements Serializable {

    @ManyToOne
    @JoinColumn(name = "idCategory", nullable = false)
    private Category category;

    //TODO connection Image-Item
    @OneToMany(mappedBy="item")
    private Set<Image> imageSet;

    //TODO connection Bid-Item
    @OneToMany(mappedBy="item")
    private Set<Bid> bidSet;

    //TODO connection User-Item
    @ManyToOne
    @JoinColumn(name="idSeller", nullable = false)
    private User seller;

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
