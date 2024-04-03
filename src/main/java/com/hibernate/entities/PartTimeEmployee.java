package com.hibernate.entities;

import jakarta.persistence.Column;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;

@Entity
@DiscriminatorValue(value = "part_emp")
public class PartTimeEmployee extends Employee{

	@Column(name = "pay_per_hour")
	private double payPerHour;
	
	@Column(name = "contract_period")
	private String contractPeriod;

	public PartTimeEmployee(int id, String name, double payPerHour, String contractPeriod) {
		super(id, name);
		this.payPerHour = payPerHour;
		this.contractPeriod = contractPeriod;
	}

	public PartTimeEmployee(int id, String name) {
		super(id, name);
	}

	public PartTimeEmployee() {
	}

	public double getPayPerHour() {
		return payPerHour;
	}

	public void setPayPerHour(double payPerHour) {
		this.payPerHour = payPerHour;
	}

	public String getContractPeriod() {
		return contractPeriod;
	}

	public void setContractPeriod(String contractPeriod) {
		this.contractPeriod = contractPeriod;
	}
	
}
