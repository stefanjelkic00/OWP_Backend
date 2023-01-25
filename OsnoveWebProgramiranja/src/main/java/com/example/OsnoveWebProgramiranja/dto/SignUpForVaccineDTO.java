package com.example.OsnoveWebProgramiranja.dto;

public class SignUpForVaccineDTO {
	private String lastName;

	private String patientIdNumber;

	private String vaccine;

	public SignUpForVaccineDTO() {
		super();
	}

	public SignUpForVaccineDTO(String lastName, String patientIdNumber, String vaccine) {
		super();
		this.lastName = lastName;
		this.patientIdNumber = patientIdNumber;
		this.vaccine = vaccine;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getPatientIdNumber() {
		return patientIdNumber;
	}

	public void setPatientIdNumber(String patientIdNumber) {
		this.patientIdNumber = patientIdNumber;
	}

	public String getVaccine() {
		return vaccine;
	}

	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}
	
	
	
}
