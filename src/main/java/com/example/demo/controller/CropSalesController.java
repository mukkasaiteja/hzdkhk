package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CropDetails;
import com.example.demo.service.CropSalesService;

@RestController
@CrossOrigin("http://localhost:4200")
public class CropSalesController {
	
	@Autowired
	CropSalesService css;
	
	@PostMapping("/CSSRegister")
	public void registerCSS(@RequestBody CropDetails cs) {
		System.out.println(cs);
		css.registercs(cs);
	}
	@GetMapping("/csList")
	public List<CropDetails> getAllCrop(){
		return css.getAllCropSales();
	}
	@GetMapping("/cslist/{csid}")
	public CropDetails getCrosaleById(@PathVariable("csid") int csid) {
		return css.getCrop(csid);
	}
	
}
