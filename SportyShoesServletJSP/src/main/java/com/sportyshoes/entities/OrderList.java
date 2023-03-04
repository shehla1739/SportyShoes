package com.sportyshoes.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "category")
public class OrderList {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="id")
	private int id;
	@Column(name="reference")
	private String reference;
	@Column(name="total_order_amount")
	private int totalOrderAmount;	
	
	public OrderList() {
		super();
	}

	public OrderList(String reference, int totalOrderAmount) {
		super();
		this.reference = reference;
		this.totalOrderAmount = totalOrderAmount;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getReference() {
		return reference;
	}

	public void setReference(String reference) {
		this.reference = reference;
	}

	public int getTotalOrderAmount() {
		return totalOrderAmount;
	}

	public void setTotalOrderAmount(int totalOrderAmount) {
		this.totalOrderAmount = totalOrderAmount;
	}

	@Override
	public String toString() {
		return "orderList [id=" + id + ", reference=" + reference + ", totalOrderAmount=" + totalOrderAmount + "]";
	}
		
}
