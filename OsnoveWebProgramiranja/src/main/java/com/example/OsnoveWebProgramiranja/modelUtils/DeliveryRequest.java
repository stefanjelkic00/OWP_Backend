package com.example.OsnoveWebProgramiranja.modelUtils;

import com.example.OsnoveWebProgramiranja.models.Vaccine;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class DeliveryRequest {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		@ManyToOne
		@JoinColumn(name = "vaccine", referencedColumnName = "id", nullable = false)
		private Vaccine vaccine;

		private int vaccineAmount;

		
		private String deliveryReason;

		private String adminMessage;

		@Enumerated(EnumType.STRING)
		private DeliveryStatus status;

		public DeliveryRequest() {
			super();
		}

		public DeliveryRequest(int id, Vaccine vaccine, int vaccineAmount, String deliveryReason, String adminMessage,
				DeliveryStatus status) {
			super();
			this.id = id;
			this.vaccine = vaccine;
			this.vaccineAmount = vaccineAmount;
			this.deliveryReason = deliveryReason;
			this.adminMessage = adminMessage;
			this.status = status;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public Vaccine getVaccine() {
			return vaccine;
		}

		public void setVaccine(Vaccine vaccine) {
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

		public DeliveryStatus getStatus() {
			return status;
		}

		public void setStatus(DeliveryStatus status) {
			this.status = status;
		}

		
		
		
		
		

}
