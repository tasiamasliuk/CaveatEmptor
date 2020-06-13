package com.example.caveatemptor.models;

import javax.persistence.*;
import java.util.Set;

@Entity
public class Category {

    @OneToMany(mappedBy = "category")
    private Set<Item> items;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idCategory;
    private String name;

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
