package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.CropSalesFD;
import com.example.demo.service.CropSalesFDService;

@RestController
@CrossOrigin("http://localhost:4200")
public class CropSaleFDController {
	@Autowired
	private CropSalesFDService csfds;
	
	@PostMapping("/registerCrop")
	public void regoisterCropSale(@RequestBody CropSalesFD csfd) {
		csfds.register(csfd);
	}
	@GetMapping("/allCropSales")
	public List<CropSalesFD> getAllCropSales(){
		return csfds.getAll();
	}
	@GetMapping("/cropSaleById{cropsaleId}")
	public CropSalesFD getByIdCropService(@PathVariable("cropsaleId") int cropsaleId) {
		return csfds.getById(cropsaleId);
	}
}
