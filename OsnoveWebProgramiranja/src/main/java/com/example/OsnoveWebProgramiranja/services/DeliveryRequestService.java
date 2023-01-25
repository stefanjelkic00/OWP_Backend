package com.example.OsnoveWebProgramiranja.services;

import java.util.List;

import com.example.OsnoveWebProgramiranja.dto.DeliveryRequestDTO;


public interface DeliveryRequestService {
	
	public void create(DeliveryRequestDTO deliveryRequestDto);
	
	public void approveRequest(String vaccineName, int vaccineAmount);

	public void declineRequest(String vaccineName, String adminMessage);

	public void returnRequest(String vaccineName, String adminMessage);

	public void changeRequest(String vaccineName, int vaccineAmount);
	
	
	public List<DeliveryRequestDTO> allRequests();
	
	
}
