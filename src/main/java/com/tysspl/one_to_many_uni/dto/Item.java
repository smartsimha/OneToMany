package com.tysspl.one_to_many_uni.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Item {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private int quantityInGrams;
	private int cost;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getQuantityInGrams() {
		return quantityInGrams;
	}
	public void setQuantityInGrams(int quantityInGrams) {
		this.quantityInGrams = quantityInGrams;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	@Override
	public String toString() {
		return "Item [id=" + id + ", name=" + name + ", quantityInGrams=" + quantityInGrams + ", cost=" + cost + "]";
	}
	
}
