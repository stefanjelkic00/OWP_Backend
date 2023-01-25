package com.example.OsnoveWebProgramiranja.services;

import java.util.List;

import com.example.OsnoveWebProgramiranja.dto.PatientsRecievedVaccineDTO;


public interface PatientsRecievedVaccineService {
	
	public void create(PatientsRecievedVaccineDTO patientsRecievedVaccineDTO);
	
	
	public List<PatientsRecievedVaccineDTO> allRecievedVaccinesByUser(String idNumber);
}
