package com.example.sweater.domain;

import javax.persistence.*;
import java.util.List;
@Entity
public class Post {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer post_id;

    String post_name;

    Integer salary;

    //FK-PK
    //PK-FK
    @OneToMany(mappedBy = "post", cascade = CascadeType.ALL)
    private List<Staff> staff;

    public Integer getPost_id() {
        return post_id;
    }

    public void setPost_id(Integer post_id) {
        this.post_id = post_id;
    }

    public String getPost_name() {
        return post_name;
    }

    public void setPost_name(String post_name) {
        this.post_name = post_name;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public List<Staff> getStaff() {
        return staff;
    }

    public void setStaff(List<Staff> staff) {
        this.staff = staff;
    }

    public Post() {
    }
}
