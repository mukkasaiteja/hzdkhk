package com.example.demo.daoRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.LabourForCrop;

@Repository
public interface LabourCropJPA extends JpaRepository<LabourForCrop, Integer> {

}
