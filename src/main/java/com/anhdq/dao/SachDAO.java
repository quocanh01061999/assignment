package com.anhdq.dao;


import com.anhdq.entity.SachEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class SachDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public void insertSach(SachEntity sach) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(sach);
        em.getTransaction().commit();
        em.close();
    }

    public List<SachEntity> getAllSach() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<SachEntity> list = em.createQuery("select c from SachEntity c", SachEntity.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }
}

