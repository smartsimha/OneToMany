package com.tysspl.one_to_many_uni.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Organization {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String address;
	@OneToMany
	List<Bus> busses;
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
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public List<Bus> getBusses() {
		return busses;
	}
	public void setBusses(List<Bus> busses) {
		this.busses = busses;
	}
	@Override
	public String toString() {
		return "Organization [id=" + id + ", name=" + name + ", address=" + address + ", busses=" + busses + "]";
	}
	
}
