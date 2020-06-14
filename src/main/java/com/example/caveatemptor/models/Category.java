package com.example.caveatemptor.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategory;
    private String name;

    //connection between table Item - Category
    @OneToMany(mappedBy = "category")
    private Set<Item> itemSet;

    //TODO connection Category - Category
    @ManyToOne
    @JoinColumn(name="parentid")
    private Category parent;

    protected Category(){}

    public Category(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
