package com.tysspl.one_to_many_uni.dto;

import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

@Entity

public class Country {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String countryName;
	private String rullingGovt;
	private int papulationInCr;
	@OneToMany
	private List<State> ls;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public String getRullingGovt() {
		return rullingGovt;
	}

	public void setRullingGovt(String rullingGovt) {
		this.rullingGovt = rullingGovt;
	}

	public int getPapulationInCr() {
		return papulationInCr;
	}

	public void setPapulationInCr(int papulationInCr) {
		this.papulationInCr = papulationInCr;
	}

	public List<State> getLs() {
		return ls;
	}

	public void setLs(List<State> ls) {
		this.ls = ls;
	}

	@Override
	public String toString() {
		return "Country [id=" + id + ", countryName=" + countryName + ", rullingGovt=" + rullingGovt
				+ ", papulationInCr=" + papulationInCr + ", ls=" + ls + "]";
	}

}
