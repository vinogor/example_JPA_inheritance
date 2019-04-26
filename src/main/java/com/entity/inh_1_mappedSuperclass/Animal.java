package com.entity.inh_1_mappedSuperclass;

import javax.persistence.*;

//@Entity
public class Animal extends Being {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}