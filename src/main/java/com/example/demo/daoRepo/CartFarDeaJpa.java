package com.example.demo.daoRepo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CartFarmerDealer;

@Repository
public interface CartFarDeaJpa extends JpaRepository<CartFarmerDealer, Integer> {
	public List<CartFarmerDealer> findAllByFarmerId(int farmerId);
	@Query(value="select count(c) from CartFarmerDealer c where farmerId=?1 ")
	public int getCountFarmer(int farmerId);
	
//	public List<CartFarmerDealer> findAllDealerId(int dealerId);
//	@Query(value="select count(c) from CartFarmerDealer c where dealerId=?1 ")
//	public int getCountDealer(int dealerId);
//

}
