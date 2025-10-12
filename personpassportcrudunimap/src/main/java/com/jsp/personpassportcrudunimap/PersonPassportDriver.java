package com.jsp.personpassportcrudunimap;

import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.personpassportcrudunimap.entity.Passport;
import com.jsp.personpassportcrudunimap.entity.Person;

public class PersonPassportDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("amey");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Person p1 = new Person(101,"ajay", 23);
		Passport ps1 = new Passport(435678, 2002,"pune", p1);
		
		Person p2 = new Person(102, "arun", 24);
		Passport ps2 = new Passport(643728, 1998, "Mumbai", p2);
		
		Person p3 = new Person(103, "ajay", 22);
		Passport ps3 = new Passport(2367483, 2003, "pune", p3);
		
		
		
		
		et.begin();
		
		em.persist(p1);
		em.persist(ps1);
		
		em.persist(p2);
		em.persist(ps2);
		
		em.persist(p3);
		em.persist(ps3);
		
		et.commit();
	}

}
