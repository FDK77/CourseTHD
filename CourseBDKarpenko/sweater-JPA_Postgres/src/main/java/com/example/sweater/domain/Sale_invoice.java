package com.example.sweater.domain;

import javax.persistence.*;

@Entity
public class Sale_invoice {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer sale_inovice_id;

    Integer quantity;

    //FK-PK
    @ManyToOne
    @JoinColumn(name = "product_id")
    private Products products;

    @ManyToOne
    @JoinColumn(name = "sale_id")
    private Sale sale;

    public Integer getSale_inovice_id() {
        return sale_inovice_id;
    }

    public void setSale_inovice_id(Integer sale_inovice_id) {
        this.sale_inovice_id = sale_inovice_id;
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

    public Sale getSale() {
        return sale;
    }

    public void setSale(Sale sale) {
        this.sale = sale;
    }

    public Sale_invoice() {
    }
}
