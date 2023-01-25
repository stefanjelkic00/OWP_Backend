package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.Vaccine;

@Repository
public interface VaccineRepository extends JpaRepository<Vaccine, Integer>{
	
}
