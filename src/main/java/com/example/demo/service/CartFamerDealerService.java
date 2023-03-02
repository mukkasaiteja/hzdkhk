package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daoRepo.CartFarDeaJpa;
import com.example.demo.entity.CartFarmerDealer;

@Service
public class CartFamerDealerService {

	
	 private CartFarDeaJpa cfdjpa;
	
	
	 @Autowired
	public CartFamerDealerService(CartFarDeaJpa cfdjpa){
		this.cfdjpa = cfdjpa;
	}
	
	
	@Transactional
	public void register(CartFarmerDealer cfd) {
		cfdjpa.save(cfd);
	}
	
	@Transactional
	public List<CartFarmerDealer> allListCart(){
		return cfdjpa.findAll();
	}
	
	@Transactional
	public CartFarmerDealer findById(int cId) {
		return cfdjpa.findById(cId).get();
	}
	@Transactional
	public void deleteById(int cId) {
		cfdjpa.deleteById(cId);
	}
}
