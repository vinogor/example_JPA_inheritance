package com.entity.inh_1_mappedSuperclass;

import javax.persistence.Entity;
import javax.persistence.Table;

//@Entity
public class Plant extends Being {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
