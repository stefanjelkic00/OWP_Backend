package com.example.OsnoveWebProgramiranja.dto;


public class DeliveryRequestDTO {

	private String vaccine;

	private int vaccineAmount;

	private String deliveryReason;

	private String adminMessage;

	private String status;

	public DeliveryRequestDTO() {
		super();
	}

	public DeliveryRequestDTO(String vaccine, int vaccineAmount, String deliveryReason, String adminMessage,
			String status) {
		super();
		this.vaccine = vaccine;
		this.vaccineAmount = vaccineAmount;
		this.deliveryReason = deliveryReason;
		this.adminMessage = adminMessage;
		this.status = status;
	}

	public String getVaccine() {
		return vaccine;
	}

	public void setVaccine(String vaccine) {
		this.vaccine = vaccine;
	}

	public int getVaccineAmount() {
		return vaccineAmount;
	}

	public void setVaccineAmount(int vaccineAmount) {
		this.vaccineAmount = vaccineAmount;
	}

	public String getDeliveryReason() {
		return deliveryReason;
	}

	public void setDeliveryReason(String deliveryReason) {
		this.deliveryReason = deliveryReason;
	}

	public String getAdminMessage() {
		return adminMessage;
	}

	public void setAdminMessage(String adminMessage) {
		this.adminMessage = adminMessage;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}
	
	
}
