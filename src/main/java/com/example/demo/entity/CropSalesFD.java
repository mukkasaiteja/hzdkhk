package com.example.demo.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="CropSalesBetween")
public class CropSalesFD {
	@Id
	@GeneratedValue
	private int saleId;
	private String location;
	
	@ManyToOne
	@JoinColumn(name="farmerId")
	private Farmer farmerId;
	
	@ManyToOne
	@JoinColumn(name="dealerId")
	private Dealer dealerId;

	public CropSalesFD(int saleId, String location, Farmer farmerId, Dealer dealerId) {
		super();
		this.saleId = saleId;
		this.location = location;
		this.farmerId = farmerId;
		this.dealerId = dealerId;
	}

	public int getSaleId() {
		return saleId;
	}

	public void setSaleId(int saleId) {
		this.saleId = saleId;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public Farmer getFarmerId() {
		return farmerId;
	}

	public void setFarmerId(Farmer farmerId) {
		this.farmerId = farmerId;
	}

	public Dealer getDealerId() {
		return dealerId;
	}

	public void setDealerId(Dealer dealerId) {
		this.dealerId = dealerId;
	}
	
	
	
}
