package com.example.OsnoveWebProgramiranja.dto;

import java.time.LocalDate;

public class RegistrationDTO {

	private String name;
	private String lastName;
	private LocalDate dateOfBirth;
	private String idnumber;
	private String adress;
	private String telefon;
	private String email;
	private String password;
	public RegistrationDTO() {
		super();
	}
	public RegistrationDTO(String name, String lastName, LocalDate dateOfBirth, String idnumber, String adress,
			String telefon, String email, String password) {
		super();
		this.name = name;
		this.lastName = lastName;
		this.dateOfBirth = dateOfBirth;
		this.idnumber = idnumber;
		this.adress = adress;
		this.telefon = telefon;
		this.email = email;
		this.password = password;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public LocalDate getDateOfBirth() {
		return dateOfBirth;
	}
	public void setDateOfBirth(LocalDate dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}
	public String getIdnumber() {
		return idnumber;
	}
	public void setIdnumber(String idnumber) {
		this.idnumber = idnumber;
	}
	public String getAdress() {
		return adress;
	}
	public void setAdress(String adress) {
		this.adress = adress;
	}
	public String getTelefon() {
		return telefon;
	}
	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	
	
}
