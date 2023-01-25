package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import modelUtils.PatientsRecievedVaccine;

@Repository
public interface PatientsRecievedVaccineRepository extends JpaRepository<PatientsRecievedVaccine, Integer>{



}
