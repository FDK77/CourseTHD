package com.example.sweater.domain;

import javax.persistence.*;
import java.util.List;
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer client_id;

    //FK-PK

    @ManyToOne
    @JoinColumn(name = "human_id")
    private Human human;

    //PK-FK

    @OneToMany(mappedBy = "client", cascade = CascadeType.ALL)
    private List<Sale> sale;

    public Integer getClient_id() {
        return client_id;
    }

    public void setClient_id(Integer client_id) {
        this.client_id = client_id;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human_id) {
        this.human = human_id;
    }

    public List<Sale> getSale() {
        return sale;
    }

    public void setSale(List<Sale> sale) {
        this.sale = sale;
    }

    public Client() {
    }

}
