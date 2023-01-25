package com.example.OsnoveWebProgramiranja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OsnoveWebProgramiranja.models.Vaccine;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine, Integer>{
	
}
