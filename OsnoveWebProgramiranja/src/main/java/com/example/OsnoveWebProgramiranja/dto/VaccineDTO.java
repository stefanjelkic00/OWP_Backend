package com.example.OsnoveWebProgramiranja.dto;

import org.springframework.lang.Nullable;

public class VaccineDTO {
	
	
	private String name;
	
	private int availableSupply;
	
	private String vaccineProducer;
	
	
	public VaccineDTO() {
		super();
	}
	public VaccineDTO(String name, int availableSupply, String vaccineProducer) {
		super();
		this.name = name;
		this.availableSupply = availableSupply;
		this.vaccineProducer = vaccineProducer;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAvailableSupply() {
		return availableSupply;
	}
	public void setAvailableSupply(int availableSupply) {
		this.availableSupply = availableSupply;
	}
	public String getVaccineProducer() {
		return vaccineProducer;
	}
	public void setVaccineProducer(String vaccineProducer) {
		this.vaccineProducer = vaccineProducer;
	}

	
	
}
