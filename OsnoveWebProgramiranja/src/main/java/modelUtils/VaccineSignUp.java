package modelUtils;

import models.User;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import models.Vaccine;

@Entity
public class VaccineSignUp {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		@ManyToOne
		@JoinColumn(name = "pacijent", referencedColumnName = "id", nullable = false)
		private User patient;

		@ManyToOne
		@JoinColumn(name = "vakcina", referencedColumnName = "id", nullable = false)
		private Vaccine vaccine;

	
}
