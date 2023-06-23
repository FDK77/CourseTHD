package com.example.sweater.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;

@Entity
public class Supply {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer supply_id;


    @Column(name = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date date;
//FK-PK
    @ManyToOne
    @JoinColumn(name = "supplier_id")
    private Suppliers suppliers;
//PK-FK
    @OneToMany(mappedBy = "supply", cascade = CascadeType.ALL)
    private List<Supply_invoice> supply_invoice;

    public Integer getSupply_id() {
        return supply_id;
    }

    public void setSupply_id(Integer supply_id) {
        this.supply_id = supply_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Suppliers getSuppliers() {
        return suppliers;
    }

    public void setSuppliers(Suppliers suppliers) {
        this.suppliers = suppliers;
    }

    public List<Supply_invoice> getSupply_invoice() {
        return supply_invoice;
    }

    public void setSupply_invoice(List<Supply_invoice> supply_invoice) {
        this.supply_invoice = supply_invoice;
    }

    public Supply() {
    }
}
