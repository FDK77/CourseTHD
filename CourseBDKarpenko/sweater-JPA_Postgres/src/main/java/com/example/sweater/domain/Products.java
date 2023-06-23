package com.example.sweater.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Products {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer product_id;

    String product_name;

    Integer price;

    String type;

    //FK-PK
    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;


    //PK-FK
    @OneToMany(mappedBy = "products", cascade = CascadeType.ALL)
    private List<Supply_invoice> supply_invoice;

    @OneToMany(mappedBy = "products", cascade = CascadeType.ALL)
    private List<Sale_invoice> sale_invoice;

    public Integer getProduct_id() {
        return product_id;
    }

    public void setProduct_id(Integer product_id) {
        this.product_id = product_id;
    }

    public String getProduct_name() {
        return product_name;
    }

    public void setProduct_name(String product_name) {
        this.product_name = product_name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop) {
        this.shop = shop;
    }

    public List<Supply_invoice> getSupply_invoice() {
        return supply_invoice;
    }

    public void setSupply_invoice(List<Supply_invoice> supply_invoice) {
        this.supply_invoice = supply_invoice;
    }

    public List<Sale_invoice> getSale_invoice() {
        return sale_invoice;
    }

    public void setSale_invoice(List<Sale_invoice> sale_invoice) {
        this.sale_invoice = sale_invoice;
    }

    public Products() {
    }
}
