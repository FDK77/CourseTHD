package com.example.sweater.domain;

import javax.persistence.*;
import java.util.List;
@Entity
public class Staff {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer service_number;

    String passport_details;

    //FK-PK
    @ManyToOne
    @JoinColumn(name = "post_id")
    private Post post;

    @ManyToOne
    @JoinColumn(name = "human_id")
    private Human human;

    @ManyToOne
    @JoinColumn(name = "shop_id")
    private Shop shop;

    //PK-FK
    @OneToMany(mappedBy = "staff", cascade = CascadeType.ALL)
    private List<Sale> sale;

    public Integer getService_number() {
        return service_number;
    }

    public void setService_number(Integer service_number) {
        this.service_number = service_number;
    }

    public String getPassport_details() {
        return passport_details;
    }

    public void setPassport_details(String passport_details) {
        this.passport_details = passport_details;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post_id) {
        this.post = post_id;
    }

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human_id) {
        this.human = human_id;
    }

    public Shop getShop() {
        return shop;
    }

    public void setShop(Shop shop_id) {
        this.shop = shop_id;
    }

    public List<Sale> getSale() {
        return sale;
    }

    public void setSale(List<Sale> sale) {
        this.sale = sale;
    }

    public Staff() {
    }


}
