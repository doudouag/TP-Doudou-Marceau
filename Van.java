package com.example.JPATest;

import com.example.JPATest.Vehicule;

import javax.persistence.Entity;

@Entity
public class Van extends Vehicule {

	public Van(long plateNumber, int maxWeight) {
		super(plateNumber);
		this.maxWeight = maxWeight;
	}

	public Van() {
		super();
	}

	private int maxWeight;

	public int getMaxWeight() {
		return maxWeight;
	}

	public void setMaxWeight(int maxWeight) {
		this.maxWeight = maxWeight;
	}
	
}
