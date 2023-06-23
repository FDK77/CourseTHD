package com.example.sweater.domain;

import javax.persistence.*;
import java.util.List;
@Entity
public class Shop {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer shop_id;

    String adress;

    String shop_name;

    Integer area;

    Integer rent_price;

    String site;


    //FK-PK
    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    //PK-FK
    @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL)
    private List<Products> products;

    @OneToMany(mappedBy = "shop", cascade = CascadeType.ALL)
    private List<Staff> staff;

    public Integer getShop_id() {
        return shop_id;
    }

    public void setShop_id(Integer shop_id) {
        this.shop_id = shop_id;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public Integer getArea() {
        return area;
    }

    public void setArea(Integer area) {
        this.area = area;
    }

    public Integer getRent_price() {
        return rent_price;
    }

    public void setRent_price(Integer rent_price) {
        this.rent_price = rent_price;
    }

    public String getSite() {
        return site;
    }

    public void setSite(String site) {
        this.site = site;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city) {
        this.city = city;
    }

    public List<Products> getProducts() {
        return products;
    }

    public void setProducts(List<Products> products) {
        this.products = products;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public String getShop_name() {
        return shop_name;
    }

    public void setShop_name(String shop_name) {
        this.shop_name = shop_name;
    }

    public Shop() {
    }
}
