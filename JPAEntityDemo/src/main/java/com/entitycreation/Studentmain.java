package com.entitycreation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Studentmain {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("pu");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Student s1 = new Student();
		s1.setid(2);
		s1.setname("Manas");

		Student s2 = new Student();
		s2.setid(3);
		s2.setname("Reethu");

		em.persist(s1);
		em.persist(s2);

		em.getTransaction().commit();

		emf.close();
		em.close();

	}

}
