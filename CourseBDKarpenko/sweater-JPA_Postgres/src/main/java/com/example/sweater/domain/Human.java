package com.example.sweater.domain;

import javax.persistence.*;
import java.util.List;
@Entity
public class Human {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer human_id;

    String fullname;

    String adress;

    String email;

    String phone_number;

    //FK-PK

    @ManyToOne
    @JoinColumn(name = "city_id")
    private City city;

    //PK-FK
    @OneToMany(mappedBy = "human", cascade = CascadeType.ALL)
    private List<Client> client;

    @OneToMany(mappedBy = "human", cascade = CascadeType.ALL)
    private List<Staff> staff;

    public Human() {
    }

    public Integer getHuman_id() {
        return human_id;
    }

    public void setHuman_id(Integer human_id) {
        this.human_id = human_id;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public City getCity() {
        return city;
    }

    public void setCity(City city_id) {
        this.city = city_id;
    }

    public List<Client> getClient() {
        return client;
    }

    public void setClient(List<Client> client) {
        this.client = client;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }
}
