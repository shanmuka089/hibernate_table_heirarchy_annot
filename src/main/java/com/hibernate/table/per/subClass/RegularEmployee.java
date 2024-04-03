package com.hibernate.table.per.subClass;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.PrimaryKeyJoinColumn;
import jakarta.persistence.Table;

@Entity
@Table(name = "reg_emp")
@PrimaryKeyJoinColumn(name = "eid")
public class RegularEmployee extends Employee{

	@Column(name= "salary")
	private double salary;
	
	@Column(name = "bonus")
	private int bonus;

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public int getBonus() {
		return bonus;
	}

	public void setBonus(int bonus) {
		this.bonus = bonus;
	}

	public RegularEmployee(int id, String name, double salary, int bonus) {
		super(id, name);
		this.salary = salary;
		this.bonus = bonus;
	}

	public RegularEmployee(int id, String name) {
		super(id, name);
	}

	public RegularEmployee() {
	}
	
	
}
