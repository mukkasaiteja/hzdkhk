package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.LabourForCrop;
import com.example.demo.service.LabourForCropService;

@RestController
@CrossOrigin("http://localhost:4200")
public class LabourForCropController {

	@Autowired
	LabourForCropService lfcs;
	
	@PostMapping("/lfcsregister")
	public void lfcRegister(@RequestBody LabourForCrop lfc) {
	lfcs.lfcsRegister(lfc);	
	}
	@GetMapping("/lcList")
	public List<LabourForCrop> getAllCropLabour(){
		return lfcs.getAllLabourCrop();
	}
	
}
