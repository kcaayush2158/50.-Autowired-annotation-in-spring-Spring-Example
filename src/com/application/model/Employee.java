package com.application.model;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {
    public Integer id;
    public String name;
    @Autowired(required = false)
    public Pancard pancard;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Pancard getPancard() {
        return pancard;
    }

    public void setPancard(Pancard pancard) {
        this.pancard = pancard;
    }
}
