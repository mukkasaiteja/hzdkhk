package com.example.demo.daoRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Dealer;
@Repository

public interface DealerJPA extends JpaRepository<Dealer, Integer> {

	
}
