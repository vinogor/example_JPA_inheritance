package com.entity.inh_3_tableAndJoin;


import javax.persistence.Entity;

//@Entity
public class Animal3 extends Being3 {


    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}