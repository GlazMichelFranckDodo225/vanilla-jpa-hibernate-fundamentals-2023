package com.dgmf;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.Persistence;

public class Main {
    public static void main(String[] args) {
        // DB connection

        // To get an "EntityManagerFactory"
        EntityManagerFactory entityManagerFactory = Persistence
                .createEntityManagerFactory("jpa-hibernate-mysql");

        // To get an "EntityManager"
        // entityManager ==> what allows to control
        // transactions ==> represents the context (collection
        // of objects)
        EntityManager entityManager = entityManagerFactory.createEntityManager();

        entityManager.getTransaction().begin();

        entityManager.getTransaction().commit();
    }
}
