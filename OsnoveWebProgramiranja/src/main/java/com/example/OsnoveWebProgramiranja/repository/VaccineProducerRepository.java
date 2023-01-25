package com.example.OsnoveWebProgramiranja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OsnoveWebProgramiranja.models.VaccineProducer;

@Repository
public interface VaccineProducerRepository extends JpaRepository<VaccineProducer, Integer>{


}
