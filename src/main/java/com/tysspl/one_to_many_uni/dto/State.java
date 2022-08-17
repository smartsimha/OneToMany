package com.tysspl.one_to_many_uni.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class State {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String name;
	private String code;
	private int papulationInMillions;

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

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public int getPapulationInMillions() {
		return papulationInMillions;
	}

	public void setPapulationInMillions(int papulationInMillions) {
		this.papulationInMillions = papulationInMillions;
	}

	@Override
	public String toString() {
		return "State [id=" + id + ", name=" + name + ", code=" + code + ", papulationInLakh=" + papulationInMillions + "]";
	}

}
