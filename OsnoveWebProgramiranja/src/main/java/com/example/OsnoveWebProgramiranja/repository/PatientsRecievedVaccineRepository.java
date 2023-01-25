package com.example.OsnoveWebProgramiranja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OsnoveWebProgramiranja.modelUtils.PatientsRecievedVaccine;

@Repository
public interface PatientsRecievedVaccineRepository extends JpaRepository<PatientsRecievedVaccine, Integer>{



}
