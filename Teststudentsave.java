package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Teststudentsave {
public static void main(String[] args) {
	EntityManagerFactory emfEntityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=emfEntityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();
	
	Student s=new Student();
	s.setName("pooja");
	s.setAge(25);
	s.setMarks(88);
	
	Student s1=new Student();
	s1.setName("pooja");
	s1.setAge(25);
	s1.setMarks(88);
	
	entityTransaction.begin();
	entityManager.persist(s);
	entityManager.persist(s1);
	entityTransaction.commit();


}
}
