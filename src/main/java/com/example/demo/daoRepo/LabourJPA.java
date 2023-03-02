package com.example.demo.daoRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Labour;

@Repository
public interface LabourJPA extends JpaRepository<Labour, Integer> {

}
