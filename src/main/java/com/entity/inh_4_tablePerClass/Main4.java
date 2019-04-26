package com.entity.inh_4_tablePerClass;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Main4 {

    public static void main(String[] args) {

        EntityManagerFactory emf = Persistence.createEntityManagerFactory( "persistUnit" );
        EntityManager em = emf.createEntityManager();


        EntityTransaction tr = em.getTransaction();
        tr.begin();

//===================
// primary key - общий на 2 таблицы

        Animal4 a = new Animal4();
        a.setTitle("new Animal4 1");
        em.persist(a);

        Plant4 t = new Plant4();
        t.setTitle("new Plant4 1");
        em.persist(t);

        t = new Plant4();
        t.setTitle("new Plant4 2");
        em.persist(t);

        a = new Animal4();
        a.setTitle("new Animal4 2");
        em.persist(a);

        em.flush();

//===================
        tr.commit(); // Managed

        em.close();
        emf.close();
    }
}
