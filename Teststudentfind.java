package com.ty;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Teststudentfind {
public static void main(String[] args) {
	EntityManagerFactory emfEntityManagerFactory=Persistence.createEntityManagerFactory("vikas");
	EntityManager entityManager=emfEntityManagerFactory.createEntityManager();
	EntityTransaction entityTransaction=entityManager.getTransaction();

   Student s=entityManager.find(Student.class,1);
   
   if(s!=null) {
	   System.out.println("the student id"+":"+ s.getId());
	   System.out.println("the student name"+":"+ s.getName());
	   System.out.println("the student age"+":"+s.getAge());
	   System.out.println("the student marks"+":"+ s.getMarks());

	   
   }
   else {
	   System.out.println("data not found");
   }
}
}
