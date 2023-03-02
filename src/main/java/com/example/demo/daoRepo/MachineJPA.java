package com.example.demo.daoRepo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.Machinary;


@Repository
public interface MachineJPA extends JpaRepository<Machinary, Integer> {

}
