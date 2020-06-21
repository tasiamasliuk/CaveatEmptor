package com.example.caveatemptor.models;

import javax.persistence.*;
import java.util.Set;

@Entity
/*
@NamedQuery(name = "findByNameCategory",
            query = "select c from category where name_category = ?1")*/

public class Category {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategory;
    private String nameCategory;

    //connection between table Item - Category
    @OneToMany(mappedBy = "category")
    private Set<Item> itemSet;

    //TODO connection Category - Category
    @ManyToOne
    @JoinColumn(name="parentid")
    private Category parent;

    protected Category(){}

    public Category(String name) {
        this.nameCategory = name;
    }

    public String getNameCategory() {
        return nameCategory;
    }

    public void setNameCategory(String nameCategory) {
        this.nameCategory = nameCategory;
    }
}
