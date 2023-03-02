package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Farmer;
import com.example.demo.service.FarmerService;

//@Controller
@RestController
@CrossOrigin("http://localhost:4200")
public class FarmerController {
	@Autowired
	FarmerService fs;
	
	@PostMapping("/faregister")
	public void register(@RequestBody Farmer f) {
		System.out.println(f);
		fs.register(f);
	}
	@GetMapping("/farmersList")
	public List<Farmer> getAllFarmers(){
		return fs.getAllFarmers();
	}
	@GetMapping("/list/{fid}")
	public Farmer getFarmerById(@PathVariable int fid) {
		return fs.getFarmer(fid);
	}
}
