package com.tysspl.one_to_many_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tysspl.one_to_many_uni.dto.Mobile;
import com.tysspl.one_to_many_uni.dto.SIM;

public class SaveMobile {

	public static void main(String[] args) {
		List<SIM> ls = new ArrayList<SIM>();

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		SIM sim1 = new SIM();
		sim1.setProvider("BSNL");
		sim1.setImrc("IMRC7978554B");

		SIM sim2 = new SIM();
		sim2.setProvider("Idea");
		sim2.setImrc("IMRC1811187I");
		ls.add(sim1);
		ls.add(sim2);

		Mobile mobile = new Mobile();
		mobile.setName("Iphone");
		mobile.setCost(18000);
		mobile.setSims(ls);

		entityTransaction.begin();
		entityManager.persist(sim1);
		entityManager.persist(sim2);
		entityManager.persist(mobile);
		entityTransaction.commit();
		System.err.println("**********Saved*************");
	}

}
