package com.kd.Entity;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Customer {
	@JsonProperty("id")
	private int id;
	@JsonProperty("name")
	private String name;
	@JsonProperty("amount")
	private int amount;

	public Customer() {
		super();
	}

	public Customer(int id, String name, int amount) {
		super();
		this.id = id;
		this.name = name;
		this.amount = amount;
	}

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

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Customer [id=" + id + ", name=" + name + ", amount=" + amount + "]";
	}

    

}
