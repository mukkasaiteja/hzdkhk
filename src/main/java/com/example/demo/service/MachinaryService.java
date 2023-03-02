package com.example.demo.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.daoRepo.MachineJPA;
import com.example.demo.entity.Machinary;

@Service
public class MachinaryService {

	@Autowired
	MachineJPA mjpa;
	
	@Transactional
	public void register(Machinary mch) {
		mjpa.save(mch);
	}
	@Transactional
	public Machinary getMachine(int mid) {
		return mjpa.findById(mid).orElse(new Machinary());
	}
	@Transactional
	public List<Machinary> getAllMAchines(){
		return mjpa.findAll();
	}
	@Transactional
	public void UpdateMachine(Machinary m) {
		mjpa.save(m);
	}
	@Transactional
	public void removeById(int mid) {
		mjpa.deleteById(mid);
	}
}
