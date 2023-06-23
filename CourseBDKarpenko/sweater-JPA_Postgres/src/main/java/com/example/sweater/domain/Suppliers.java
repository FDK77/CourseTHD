package com.example.sweater.domain;

import javax.persistence.*;
import java.util.List;

@Entity
public class Suppliers {
    @Id //PK
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer supplier_id;

    String phone_number;

    String email;

    String full_name;

    String fabric;
//PK-FK
    @OneToMany(mappedBy = "suppliers", cascade = CascadeType.ALL)
    private List<Supply> supply;

    public Integer getSupplier_id() {
        return supplier_id;
    }

    public void setSupplier_id(Integer supplier_id) {
        this.supplier_id = supplier_id;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFull_name() {
        return full_name;
    }

    public void setFull_name(String full_name) {
        this.full_name = full_name;
    }

    public String getFabric() {
        return fabric;
    }

    public void setFabric(String fabric) {
        this.fabric = fabric;
    }

    public List<Supply> getSupply() {
        return supply;
    }

    public void setSupply(List<Supply> supply) {
        this.supply = supply;
    }

    public Suppliers() {
    }
}



