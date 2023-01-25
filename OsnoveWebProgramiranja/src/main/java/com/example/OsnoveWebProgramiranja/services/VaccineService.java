package com.example.OsnoveWebProgramiranja.services;

import java.util.ArrayList;
import java.util.List;

import com.example.OsnoveWebProgramiranja.dto.VaccineDTO;


public interface VaccineService {

	public void createVaccine(VaccineDTO vaccineDTO);
	
	public VaccineDTO oneVaccine(String name, String vaccineProducer);
	
	public void editVaccine(VaccineDTO vaccineDTO, String oldName, String oldProducer);
	
	public List<VaccineDTO> sortVaccineByCriterium(String name, String vaccineProducer, String country, int minAmount, int maxAmount, String sort);
	
	public ArrayList<String> allVaccineNames();
	
	public ArrayList<String> allProducersCounties();
	
	
	
	
	
	
}
