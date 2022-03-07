package com.inferrix.Sorting.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Article {
	
	@Id
	@GeneratedValue
	private int id;
	private String name;
	private int quantity;
	private long price;
	public Article(int id, String name, int quantity, long price) {
		super();
		this.id = id;
		this.name = name;
		this.quantity = quantity;
		this.price = price;
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
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public long getPrice() {
		return price;
	}
	public void setPrice(long price) {
		this.price = price;
	}
	public Article() {
		super();
	}
	public Article(String string, int nextInt, int nextInt2) {
		super();
		this.name = string;
		this.quantity = nextInt;
		this.price = nextInt2;
	}

	
	

}
