package com.tysspl.one_to_many_uni.controller;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.tysspl.one_to_many_uni.dto.FoodOrder;
import com.tysspl.one_to_many_uni.dto.Item;

public class SaveFoodOrder {

	public static void main(String[] args) {
		List<Item> li = new ArrayList<Item>();

		Item item1 = new Item();
		item1.setName("Mushroom curry");
		item1.setCost(250);
		item1.setQuantityInGrams(1000);

		Item item2 = new Item();
		item2.setName("Paneer butter masala");
		item2.setCost(100);
		item2.setQuantityInGrams(500);

		Item item3 = new Item();
		item3.setName("Kane Rava Fry");
		item3.setCost(300);
		item3.setQuantityInGrams(1000);

		Item item4 = new Item();
		item4.setName("Coorg Pandi Curry ");
		item4.setCost(175);
		item4.setQuantityInGrams(750);

		li.add(item1);
		li.add(item2);
		li.add(item3);
		li.add(item4);

		FoodOrder foodOrder = new FoodOrder();
		foodOrder.setAddress("Sri Rama Pg, Marathahalli,near to biryani Zone ");
		foodOrder.setName("narasimha");
		foodOrder.setPhoneNumber(7989914585l);
		foodOrder.setLi(li);

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		entityTransaction.begin();
		entityManager.persist(item1);
		entityManager.persist(item2);
		entityManager.persist(item3);
		entityManager.persist(item4);
		entityManager.persist(foodOrder);
		entityTransaction.commit();
		System.err.println("***************************Food order saved***************************");

	}

}
