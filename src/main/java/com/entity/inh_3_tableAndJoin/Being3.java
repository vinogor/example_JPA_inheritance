package com.entity.inh_3_tableAndJoin;

import javax.persistence.*;

//@Entity
//@Inheritance(strategy = InheritanceType.JOINED)
public class Being3 {


//    @Id
//    @GeneratedValue
    private Long id;

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
