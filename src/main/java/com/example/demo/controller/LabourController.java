package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Labour;
import com.example.demo.service.LabourService;

@RestController
@CrossOrigin("http://localhost:4200")
public class LabourController {

	@Autowired
	LabourService ls;
	
	@PostMapping("/labourRegister")
	public void lregister(@RequestBody Labour labour) {
		System.err.println(labour);
		ls.lRegister(labour);
	}
	@GetMapping("/LabourList")
	public List<Labour> getAllLabours(){
		return ls.getAllLabours();
	}
	@GetMapping("/list{lid}")
	public Labour getLabourById(@PathVariable int lid) {
		return ls.getLabour(lid);
	}
	
	
}
