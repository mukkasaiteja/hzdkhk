package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daoRepo.DealerJPA;
import com.example.demo.entity.Dealer;

@Service
public class DealerService {
	
	@Autowired
	DealerJPA djpa;
	
	@Transactional
	public void registerd(Dealer d) {
		djpa.save(d);
	}
	@Transactional
	public Dealer getDealer(int did) {
		return djpa.findById(did).orElse(new Dealer());
	}
	
	@Transactional
	public List<Dealer> getAllDealer(){
		return djpa.findAll();
	}
}
