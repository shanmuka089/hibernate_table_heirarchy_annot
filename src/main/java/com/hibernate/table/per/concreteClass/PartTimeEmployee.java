package com.hibernate.table.per.concreteClass;

import jakarta.persistence.AttributeOverride;
import jakarta.persistence.AttributeOverrides;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "part_emp")
@AttributeOverrides({
	@AttributeOverride(name = "employeeId", column = @Column(name= "eid")),
	@AttributeOverride(name = "name", column = @Column(name = "name"))
	})
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
