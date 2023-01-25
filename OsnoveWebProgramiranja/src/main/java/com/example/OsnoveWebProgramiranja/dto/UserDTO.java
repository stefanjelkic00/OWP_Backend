package com.example.OsnoveWebProgramiranja.dto;


public class UserDTO {
	
	private String name;
	private String lastName;
	private String DateOfBirth;
	private String idnumber;
	private String adress;
	private String telefon;
	private String email;
	private String password;
	private String dateOfRegistration;
	private String role;
	public UserDTO() {
		super();
	}
	public UserDTO(String name, String lastName, String dateOfBirth, String idnumber, String adress, String telefon,
			String email, String password, String dateOfRegistration, String role) {
		super();
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
	public String getDateOfBirth() {
		return DateOfBirth;
	}
	public void setDateOfBirth(String dateOfBirth) {
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
	public String getDateOfRegistration() {
		return dateOfRegistration;
	}
	public void setDateOfRegistration(String dateOfRegistration) {
		this.dateOfRegistration = dateOfRegistration;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}

	
//	
	
}
