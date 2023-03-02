package com.example.demo.daoRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.CropDetails;

@Repository
public interface CropSalesJPA extends JpaRepository<CropDetails, Integer> {

}
