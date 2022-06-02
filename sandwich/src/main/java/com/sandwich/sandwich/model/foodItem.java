package com.sandwich.sandwich.model;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Entity
public class foodItem {
    @Id
    @GeneratedValue
    Long id;
    String name;
    double price;
    boolean chosen;
}
