package com.jsp.studentcrudex;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.studentcrudex.entity.Student;

public class StudentDeleteDriver {
	
	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("amey");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		et.begin();
		
		Student s1 = em.find(Student.class, 111);
		em.remove(s1);
		
		
		et.commit();
	}

}
