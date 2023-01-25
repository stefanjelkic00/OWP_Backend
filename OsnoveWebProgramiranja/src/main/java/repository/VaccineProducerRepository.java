package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.VaccineProducer;

@Repository
public interface VaccineProducerRepository extends JpaRepository<VaccineProducer, Integer>{


}
