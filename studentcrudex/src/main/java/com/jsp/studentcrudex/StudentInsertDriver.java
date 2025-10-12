package com.jsp.studentcrudex;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.studentcrudex.entity.Student;

public class StudentInsertDriver {
	public static void main(String[] args) {
		
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("amey");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	
	Student s1 = new Student(111,"vishal","akola",10,89.90);
	Student s2 = new Student(112,"dinesh","shirur",10,92.70);
	Student s3 = new Student(113,"vivek","jamthi",9,82.30);
	
	et.begin();
	
	em.persist(s1);
	em.persist(s2);
	em.persist(s3);
	
	et.commit();
	
	}

}
