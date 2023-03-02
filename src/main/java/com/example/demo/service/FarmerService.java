package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daoRepo.FormerJPA;
import com.example.demo.entity.Farmer;

@Service
public class FarmerService {
	@Autowired
	FormerJPA fjpa;
	
	@Transactional
	public void register(Farmer farmer) {
		fjpa.save(farmer);
	}
	@Transactional
	public Farmer getFarmer(int fid) {
		return fjpa.findById(fid).orElse(new Farmer());
	}
	@Transactional
	public List<Farmer> getAllFarmers(){
		return fjpa.findAll();
	}
}
