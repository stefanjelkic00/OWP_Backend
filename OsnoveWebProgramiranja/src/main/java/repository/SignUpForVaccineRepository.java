package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modelUtils.SignUpForVaccine;

@Repository
public interface SignUpForVaccineRepository extends JpaRepository<SignUpForVaccine, Integer>{

	
}
