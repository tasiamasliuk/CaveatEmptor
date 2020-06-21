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

    //connection Image-Item
    @OneToMany(mappedBy="item")
    private Set<Image> imageSet;

    //connection Bid-Item
    @OneToMany(mappedBy="item")
    private Set<Bid> bidSet;

    //connection User-Item
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

    public Item(String nameItem, BigDecimal initialPrice, Date auctionEnd, Category category, User seller) {
        this.category = category;
        this.seller = seller;
        this.nameItem = nameItem;
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

    @Override
    public String toString() {
        return "Item name: " + nameItem + " Initial price: " + initialPrice + " Auction Ends: " + auctionEnd + " category: " + category.getNameCategory() + "\n";
    }
}
