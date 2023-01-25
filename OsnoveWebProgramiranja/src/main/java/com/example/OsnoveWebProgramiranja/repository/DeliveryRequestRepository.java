package com.example.OsnoveWebProgramiranja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OsnoveWebProgramiranja.modelUtils.DeliveryRequest;

@Repository
public interface DeliveryRequestRepository extends JpaRepository<DeliveryRequest, Integer>{

	


}
