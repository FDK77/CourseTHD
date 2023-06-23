package com.example.sweater.domain;

import org.springframework.format.annotation.DateTimeFormat;

import javax.persistence.*;
import java.util.Date;
import java.util.List;
@Entity
public class Sale {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer sale_id;

    @Column(name = "date")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
    Date date;

    //FK-PK
    @ManyToOne
    @JoinColumn(name = "service_number")
    private Staff staff;

    @ManyToOne
    @JoinColumn(name = "client_id")
    private Client client;


    //PK-FK
    @OneToMany(mappedBy = "sale", cascade = CascadeType.ALL)
    private List<Sale_invoice> sale_invoice;

    public Sale() {
    }

    public Integer getSale_id() {
        return sale_id;
    }

    public void setSale_id(Integer sale_id) {
        this.sale_id = sale_id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Staff getStaff() {
        return staff;
    }

    public void setStaff(Staff service_number) {
        this.staff = service_number;
    }

    public Client getClient() {
        return client;
    }

    public void setClient(Client client_id) {
        this.client = client_id;
    }

    public List<Sale_invoice> getSale_invoice() {
        return sale_invoice;
    }

    public void setSale_invoice(List<Sale_invoice> sale_invoice) {
        this.sale_invoice = sale_invoice;
    }
}
