package com.example.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.daoRepo.CartFarDeaJpa;
import com.example.demo.entity.CartFarmerDealer;
import com.example.demo.service.CartFamerDealerService;

@RestController
@RequestMapping("/CartFarmerDealerC")
@CrossOrigin("http://localhost:4200")
public class CartFarmerDealerController {
	
	private CartFamerDealerService cfdser;
	private CartFarDeaJpa cfdjpaquery;
	
	@Autowired
	public CartFarmerDealerController(CartFamerDealerService cfdser, CartFarDeaJpa cfdjpaquery) {
		
		this.cfdser = cfdser;
		this.cfdjpaquery = cfdjpaquery;
	}
	@GetMapping("/cartFDAllList")
	public List<CartFarmerDealer> displayAll(){
		List<CartFarmerDealer> cfdList= cfdser.allListCart();
		return cfdList;
	}
	@GetMapping("/cartFDfarmerId/{farmerId}")
	public List<CartFarmerDealer> farmerCartData(@PathVariable("farmerId") int farmerId){
		return cfdjpaquery.findAllByFarmerId(farmerId);
	}
	@GetMapping("/list/{cartId}")
	public CartFarmerDealer getAllDataById(@PathVariable("cartId") int cartId) {
		CartFarmerDealer  cfd=cfdser.findById(cartId);
		if(cfd==null)
			throw new RuntimeException("id not found");
			return cfd;
	}
	@PostMapping("/List")
	public void insortOrUpdate(@RequestBody CartFarmerDealer cfd) {
		cfd.setCartId(0);
		cfdser.register(cfd);
	}
	@PutMapping("/list")
	public void modify(@RequestBody CartFarmerDealer cfd) {
		cfdser.register(cfd);
		
	}
	@DeleteMapping("/delete/{id}")
	public void deleteById(@PathVariable int id) {
		cfdser.deleteById(id);
	}
	@GetMapping("/ cartFarmerCount/{farmerId}")
	public int getCountFarmer(@PathVariable int farmerId) {
		return cfdjpaquery.getCountFarmer(farmerId);
	}
//	@GetMapping("/cartDealerCount/{dealerId}")
//	public int getCountDealer(@PathVariable int dealerId) {
//		return cfdjpaquery.getCountDealer(dealerId);
//	}
}
