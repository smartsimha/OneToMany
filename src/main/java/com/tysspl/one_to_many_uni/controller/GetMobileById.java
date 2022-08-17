package com.tysspl.one_to_many_uni.controller;

import java.util.Scanner;
import com.tysspl.one_to_many_uni.dto.Mobile;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetMobileById {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		String q = "select m from Mobile m where m.name=:jingalala";
		Query query = entityManager.createNamedQuery(q);
		query.setParameter("jingalala", sc.next());
		Mobile mobile = (Mobile) query.getSingleResult();
		if (mobile != null) {
			System.out.println(mobile);
		} else {
			System.err.println("No data found");
		}
	}

}
