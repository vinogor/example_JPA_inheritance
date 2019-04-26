package com.entity.inh_3_tableAndJoin;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main3 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "persistUnit" );
        EntityManager em = emf.createEntityManager();


        EntityTransaction tr = em.getTransaction();
        tr.begin();

//===================
// primary key - общий на 2 таблицы

        Animal3 a = new Animal3();
        a.setTitle("new Animal4 1");
        em.persist(a);

        Plant3 t = new Plant3();
        t.setTitle("new Plant4 1");
        em.persist(t);

        t = new Plant3();
        t.setTitle("new Plant4 2");
        em.persist(t);

        a = new Animal3();
        a.setTitle("new Animal4 2");
        em.persist(a);

        em.flush();

//===================
        tr.commit(); // Managed

        em.close();
        emf.close();
    }
}
