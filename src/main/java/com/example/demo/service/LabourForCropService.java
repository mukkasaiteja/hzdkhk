package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daoRepo.LabourCropJPA;
import com.example.demo.entity.LabourForCrop;

@Service
public class LabourForCropService {
	@Autowired
	LabourCropJPA lcjpa;
	
	@Transactional
	public void lfcsRegister(LabourForCrop lfc) {
		lcjpa.save(lfc);
	}
	@Transactional
	public List<LabourForCrop> getAllLabourCrop(){
		return lcjpa.findAll();
	}
	@Transactional
	public LabourForCrop getLabourCrop(int lcid) {
		return lcjpa.findById(lcid).orElse(new LabourForCrop());
	}
	
}
