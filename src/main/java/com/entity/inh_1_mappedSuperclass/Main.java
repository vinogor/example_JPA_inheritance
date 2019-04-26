package com.entity.inh_1_mappedSuperclass;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "persistUnit" );
        EntityManager em = emf.createEntityManager();


        EntityTransaction tr = em.getTransaction();
        tr.begin();

//===================
// primary key - общий на 2 таблицы

        Animal a = new Animal();
        a.setTitle("new Animal 1");
        em.persist(a);

        Plant t = new Plant();
        t.setTitle("new Plant 1");
        em.persist(t);

        t = new Plant();
        t.setTitle("new Plant 2");
        em.persist(t);

        a = new Animal();
        a.setTitle("new Animal 2");
        em.persist(a);

        em.flush();

//===================
        tr.commit(); // Managed

        em.close();
        emf.close();
    }
}
