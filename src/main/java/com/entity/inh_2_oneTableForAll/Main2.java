package com.entity.inh_2_oneTableForAll;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main2 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "persistUnit" );
        EntityManager em = emf.createEntityManager();


        EntityTransaction tr = em.getTransaction();
        tr.begin();

//===================
// primary key - общий на 2 таблицы

        Animal2 a = new Animal2();
        a.setTitle("new Animal2 1");
        em.persist(a);

        Plant2 t = new Plant2();
        t.setTitle("new Plant2 1");
        em.persist(t);

        t = new Plant2();
        t.setTitle("new Plant2 2");
        em.persist(t);

        a = new Animal2();
        a.setTitle("new Animal2 2");
        em.persist(a);

        em.flush();

//===================
        tr.commit(); // Managed

        em.close();
        emf.close();
    }
}
