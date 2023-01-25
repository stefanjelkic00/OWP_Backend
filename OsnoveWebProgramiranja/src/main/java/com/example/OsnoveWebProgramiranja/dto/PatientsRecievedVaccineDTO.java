package com.example.OsnoveWebProgramiranja.dto;

public class PatientsRecievedVaccineDTO {
	
	
	
	private String patientIdNumber;
	
	private String vaccine;

	private String dateOfRecievingVaccine;

	public PatientsRecievedVaccineDTO() {
		super();
	}

	public PatientsRecievedVaccineDTO(String patientIdNumber, String vaccine, String dateOfRecievingVaccine) {
		super();
		this.patientIdNumber = patientIdNumber;
		this.vaccine = vaccine;
		this.dateOfRecievingVaccine = dateOfRecievingVaccine;
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

	public String getDateOfRecievingVaccine() {
		return dateOfRecievingVaccine;
	}

	public void setDateOfRecievingVaccine(String dateOfRecievingVaccine) {
		this.dateOfRecievingVaccine = dateOfRecievingVaccine;
	}
	
	
}
