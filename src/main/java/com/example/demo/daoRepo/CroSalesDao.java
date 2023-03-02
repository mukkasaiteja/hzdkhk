package com.example.demo.daoRepo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.demo.entity.CropSalesFD;

public interface CroSalesDao extends JpaRepository<CropSalesFD, Integer> {

}
