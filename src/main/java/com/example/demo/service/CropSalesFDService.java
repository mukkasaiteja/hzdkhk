package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daoRepo.CroSalesDao;
import com.example.demo.entity.CropSalesFD;

@Service
public class CropSalesFDService {

	@Autowired
	private CroSalesDao cdjpa;
	
	@Transactional
	public void register(CropSalesFD csfd) {
		cdjpa.save(csfd);
	}
	@Transactional
	public List<CropSalesFD> getAll(){
		return cdjpa.findAll();
	}
	@Transactional
	public CropSalesFD getById(int cropSaleId) {
		return cdjpa.findById(cropSaleId).get();
	}
}
