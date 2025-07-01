package com.all.Driver;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

public class Driver_OneToMany_ManyToOne {

	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("swamy");
		EntityManager manager = factory.createEntityManager();
		EntityTransaction transaction = manager.getTransaction();

	}

}
