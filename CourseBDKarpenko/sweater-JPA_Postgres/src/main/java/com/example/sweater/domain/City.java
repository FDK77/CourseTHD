package com.example.sweater.domain;

import javax.persistence.*;
import java.util.List;
@Entity
public class City {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer city_id;

    String country;

    String region;

    String city;

    //FK-PK
    //PK-FK
    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<Shop> shop;

    @OneToMany(mappedBy = "city", cascade = CascadeType.ALL)
    private List<Human> human;

    public Integer getCity_id() {
        return city_id;
    }

    public void setCity_id(Integer city_id) {
        this.city_id = city_id;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public List<Shop> getShop() {
        return shop;
    }

    public void setShop(List<Shop> shop) {
        this.shop = shop;
    }

    public List<Human> getHuman() {
        return human;
    }

    public void setHuman(List<Human> human) {
        this.human = human;
    }

    public City() {
    }
}
