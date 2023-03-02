package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Machinary;
import com.example.demo.service.MachinaryService;

@RestController
@CrossOrigin("http://localhost:4200")
public class MachinaryController {

	@Autowired
	MachinaryService ms;
	
	@PostMapping("mregister")
	public void register(@RequestBody Machinary mcha) {
		System.out.println(mcha);
		ms.register(mcha);
	}
	@GetMapping("mchList")
	public List<Machinary> getAllMachn(){
		return ms.getAllMAchines();
	}
	@GetMapping("mbyID")
	public Machinary getMarchinaryById(@PathVariable int mid) {
		return ms.getMachine(mid);
	}
	@PostMapping("updateMachine")
	public void UpdateorSave(@RequestBody Machinary mcha) {
		ms.UpdateMachine(mcha);
	}
	@DeleteMapping("deletebyId/{mid}")
	public void deleteById(@PathVariable int mid) {
		ms.removeById(mid);
	}
}
