package com.example.demo.daoRepo;

import java.util.List;

import com.example.demo.entity.CartFarmerDealer;

public interface CartFDDeclarations {
	public List<CartFarmerDealer> displayAll();
	public CartFarmerDealer displayById(int id);
	public void insertionOrUpdate(CartFarmerDealer cartFarmerDealer);
	public void deletion(int id);
}
