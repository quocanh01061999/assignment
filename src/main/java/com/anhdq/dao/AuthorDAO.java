package com.anhdq.dao;


import com.anhdq.entity.AuthorEntity;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import java.util.List;

public class AuthorDAO {
    EntityManagerFactory emf = Persistence.createEntityManagerFactory("persistence");
    EntityManager em = emf.createEntityManager();

    public void insertAuthor(AuthorEntity author) {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        em.persist(author);
        em.getTransaction().commit();
        em.close();
    }

    public List<AuthorEntity> getAllAuthor() {
        em = emf.createEntityManager();
        em.getTransaction().begin();
        List<AuthorEntity> list = em.createQuery("select c from AuthorEntity c", AuthorEntity.class).getResultList();
        em.getTransaction().commit();
        em.close();
        return list;
    }
}

