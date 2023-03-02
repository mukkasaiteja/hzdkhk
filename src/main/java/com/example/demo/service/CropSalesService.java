package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daoRepo.CropSalesJPA;
import com.example.demo.entity.CropDetails;

@Service
public class CropSalesService {

	@Autowired
	CropSalesJPA csjpa;
	
	@Transactional
	public void registercs(CropDetails cs) {
		csjpa.save(cs);
	}
	@Transactional
	public CropDetails getCrop(int cid) {
		return csjpa.findById(cid).orElse(new CropDetails());
	}
	@Transactional
	public List<CropDetails> getAllCropSales(){
		return csjpa.findAll();
	}
}
