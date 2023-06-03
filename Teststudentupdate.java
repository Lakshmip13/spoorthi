package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Teststudentupdate {
public static void main(String[] args) {
	EntityManagerFactory emfEntityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=emfEntityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Student s=entityManager.find(Student.class,2);
	if(s!=null) {
		s.setName("lakshmi");
		s.setMarks(99);
		entityTransaction.begin();
		entityManager.merge(s);
		entityTransaction.commit();
	}
	else {
		System.out.println("data not found");
	}

}
}
