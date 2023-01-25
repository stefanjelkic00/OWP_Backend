package com.example.OsnoveWebProgramiranja.models;

import java.time.LocalDate;
import java.time.LocalDateTime;

import jakarta.persistence.Entity;


@Entity
public class User {
	@jakarta.persistence.Id
	@jakarta.persistence.GeneratedValue(strategy = jakarta.persistence.GenerationType.IDENTITY)
	private int id;

	private String name;

	private String lastName;

	@jakarta.persistence.Column(columnDefinition = "DATE")
	private LocalDate DateOfBirth;

	private String idnumber;

	private String adress;

	private String telefon;


	private String email;

	private String password;

	@jakarta.persistence.Column(columnDefinition = "TIMESTAMP")
	private LocalDateTime dateOfRegistration;

	private String role;


	public User() {
		super();
	}


	public User(int id, String name, String lastName, LocalDate dateOfBirth, String idnumber, String adress,
			String telefon, String email, String password, LocalDateTime dateOfRegistration, String role) {
		super();
		this.id = id;
		this.name = name;
		this.lastName = lastName;
		DateOfBirth = dateOfBirth;
		this.idnumber = idnumber;
		this.adress = adress;
		this.telefon = telefon;
		this.email = email;
		this.password = password;
		this.dateOfRegistration = dateOfRegistration;
		this.role = role;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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
		return DateOfBirth;
	}


	public void setDateOfBirth(LocalDate dateOfBirth) {
		DateOfBirth = dateOfBirth;
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


	public LocalDateTime getDateOfRegistration() {
		return dateOfRegistration;
	}


	public void setDateOfRegistration(LocalDateTime dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}


	public String getRole() {
		return role;
	}


	public void setRole(String role) {
		this.role = role;
	}







}
