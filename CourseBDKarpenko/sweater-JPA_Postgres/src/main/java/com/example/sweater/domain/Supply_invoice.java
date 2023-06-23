package com.example.sweater.domain;

import javax.persistence.*;

@Entity
public class Supply_invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer supply_invoice_id;

    Integer quantity;
//FK-PK
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;

    @ManyToOne
    @JoinColumn(name = "supply_id")
    private Supply supply;

    public Integer getSupply_invoice_id() {
        return supply_invoice_id;
    }

    public void setSupply_invoice_id(Integer supply_invoice_id) {
        this.supply_invoice_id = supply_invoice_id;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public Products getProducts() {
        return products;
    }

    public void setProducts(Products products) {
        this.products = products;
    }

    public Supply getSupply() {
        return supply;
    }

    public void setSupply(Supply supply) {
        this.supply = supply;
    }

    public Supply_invoice() {
    }
}
