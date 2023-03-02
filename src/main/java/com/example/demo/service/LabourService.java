package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daoRepo.LabourJPA;
import com.example.demo.entity.Labour;

@Service
public class LabourService {
	@Autowired
	LabourJPA ljpa;
	
	@Transactional
	public void lRegister(Labour labour) {
		ljpa.save(labour);
	}
	@Transactional
	public Labour getLabour(int lId) {
		return ljpa.findById(lId).orElse(new Labour());
	}
	@Transactional
	public List<Labour> getAllLabours(){
		return ljpa.findAll();
	}
}
