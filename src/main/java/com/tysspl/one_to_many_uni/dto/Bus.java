package com.tysspl.one_to_many_uni.dto;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity

public class Bus {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int busId;
	private int capacitySeats;
	private String type;

	public int getBusId() {
		return busId;
	}

	public void setBusId(int busId) {
		this.busId = busId;
	}

	public int getCapacitySeats() {
		return capacitySeats;
	}

	public void setCapacitySeats(int capacity) {
		this.capacitySeats = capacity;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Bus {busId=" + busId + ", capacity=" + capacitySeats + ", type=" + type + "}";
	}

}
