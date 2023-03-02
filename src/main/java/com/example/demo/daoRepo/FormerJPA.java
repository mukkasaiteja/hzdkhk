package com.example.demo.daoRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Farmer;


@Repository
public interface FormerJPA extends JpaRepository<Farmer, Integer> {

}
