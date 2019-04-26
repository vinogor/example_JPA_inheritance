package com.entity.inh_2_oneTableForAll;


import javax.persistence.*;

//@Entity
//@DiscriminatorValue("DiscValuePlant")
public class Plant2 extends Being2 {

    private String title;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

}
