package com.codecool.havszab.codenames.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Item {

    @Id
    @GeneratedValue
    private Long id;

    @Column
    private String name;

    @Column
    private String path;

    @Column
    private int price;

}
