package modelUtils;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import models.Vaccine;

@Entity
public class DeliveryRequest {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		@ManyToOne
		@JoinColumn(name = "vakcina", referencedColumnName = "id", nullable = false)
		private Vaccine vakcina;

		private int vaccineAmount;

		
		private String deliveryReason;

		private String adminMessage;

		@Enumerated(EnumType.STRING)
		private DeliveryStatus status;

}
