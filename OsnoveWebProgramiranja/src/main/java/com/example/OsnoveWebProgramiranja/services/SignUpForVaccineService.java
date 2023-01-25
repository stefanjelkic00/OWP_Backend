package com.example.OsnoveWebProgramiranja.services;

import java.util.List;

import com.example.OsnoveWebProgramiranja.dto.SignUpForVaccineDTO;


public interface SignUpForVaccineService {
	
	
	public void createSignUp(SignUpForVaccineDTO signUpForVaccineDTO);
	
	public void declineSignUp(SignUpForVaccineDTO signUpForVaccineDTO);

	public List<SignUpForVaccineDTO> allSignUpsAccordingToCriteria(String idNumber, String lastName);
	
	
}
