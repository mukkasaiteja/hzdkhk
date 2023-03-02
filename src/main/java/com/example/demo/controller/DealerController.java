package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Dealer;
import com.example.demo.service.DealerService;

@RestController
@CrossOrigin("http://localhost:4200")
public class DealerController {

	@Autowired
	DealerService ds;
	
	@PostMapping("/dealerregister")
	public void register(@RequestBody Dealer d) {
		ds.registerd(d);
	}
	@GetMapping("/dealerList")
	public List<Dealer> getAllDealersData(){
		System.out.println("From dealerList");
		return ds.getAllDealer();
	}
}
