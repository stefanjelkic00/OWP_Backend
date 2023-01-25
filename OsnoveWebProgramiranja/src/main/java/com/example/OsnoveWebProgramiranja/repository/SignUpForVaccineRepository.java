package com.example.OsnoveWebProgramiranja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OsnoveWebProgramiranja.modelUtils.SignUpForVaccine;

@Repository
public interface SignUpForVaccineRepository extends JpaRepository<SignUpForVaccine, Integer>{

	
}
