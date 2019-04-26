package com.entity.inh_4_tablePerClass;


import javax.persistence.Entity;

@Entity
public class Plant4 extends Being4 {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
