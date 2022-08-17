package com.tysspl.one_to_many_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tysspl.one_to_many_uni.dto.Country;
import com.tysspl.one_to_many_uni.dto.State;

public class SaveCountry {

	public static void main(String[] args) {
		List<State> ls=new ArrayList<State>();
		State state1=new State();
		state1.setName("Andhra Pradesh");
		state1.setCode("37 AP");
		state1.setPapulationInMillions(52);
		
		
		State state2=new State();
		state2.setName("Bihar");
		state2.setCode("10 BR");
		state2.setPapulationInMillions(119);
		
		State state3=new State();
		state3.setName("Assam");
		state3.setCode("18 AS");
		state3.setPapulationInMillions(34);
		
		State state4=new State();
		state4.setName("Karnataka");
		state4.setCode("29 KA");
		state4.setPapulationInMillions(66);
		
		State state5=new State();
		state5.setName("Goa");
		state5.setCode("30 GA");
		state5.setPapulationInMillions(1);
		
		ls.add(state1);
		ls.add(state2);
		ls.add(state3);
		ls.add(state4);
		ls.add(state5);
		
		Country country=new Country();
		country.setCountryName("INDIA");
		country.setPapulationInCr(147);
		country.setRullingGovt("BJP");
		country.setLs(ls);
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(state1);
		entityManager.persist(state2);
		entityManager.persist(state3);
		entityManager.persist(state4);
		entityManager.persist(state5);
		entityManager.persist(country);
		entityTransaction.commit();
		System.err.println("-------------------------------Country saved---------------------------");
	}

}
