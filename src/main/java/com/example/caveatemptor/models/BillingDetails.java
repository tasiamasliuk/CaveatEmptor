package com.example.caveatemptor.models;

import javax.persistence.*;
import java.io.Serializable;

/*
 * By default the properties of a superclass are ignored unless annotated as MappedSuperclass.
 * For the entities that extend this class, the mapping meta data present here will be applied.
 */
@MappedSuperclass
public abstract class BillingDetails implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private long idBillingDetails;

    @ManyToOne
    @JoinColumn(name="idUser", nullable = false)
    protected User owner;

    public User getOwner() {
        return owner;
    }

    public void setOwner(User owner) {
        this.owner = owner;
    }
}
