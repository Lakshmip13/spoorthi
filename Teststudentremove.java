package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Teststudentremove {
public static void main(String[] args) {
	EntityManagerFactory emfEntityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=emfEntityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

}
}
