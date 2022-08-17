package com.tysspl.one_to_many_uni.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tysspl.one_to_many_uni.dto.Bus;
import com.tysspl.one_to_many_uni.dto.Organization;

public class SaveOrganization {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		List<Bus> bl = new ArrayList<Bus>();

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Bus bus1 = new Bus();
		System.out.println("Enter the bus details");
		bus1.setCapacitySeats(sc.nextInt());
		bus1.setType(sc.next());

		Bus bus2 = new Bus();
		System.out.println("Enter the bus details");
		bus2.setCapacitySeats(sc.nextInt());
		bus2.setType(sc.next());

		bl.add(bus1);
		bl.add(bus2);
		
		Organization organization=new Organization();
		System.out.println("Enter the organization details");
		organization.setName(sc.next());
		organization.setAddress(sc.next());
		organization.setBusses(bl);
		
		entityTransaction.begin();
		entityManager.persist(bus1);
		entityManager.persist(bus2);
		entityManager.persist(organization);
		entityTransaction.commit();
		System.err.println("**************************Details saved***********************");
	}

}
