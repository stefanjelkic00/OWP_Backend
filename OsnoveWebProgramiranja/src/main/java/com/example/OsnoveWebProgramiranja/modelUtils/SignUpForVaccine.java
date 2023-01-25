package com.example.OsnoveWebProgramiranja.modelUtils;

import com.example.OsnoveWebProgramiranja.models.User;
import com.example.OsnoveWebProgramiranja.models.Vaccine;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

@Entity
public class SignUpForVaccine {


		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		@ManyToOne
		@JoinColumn(name = "patient", referencedColumnName = "id", nullable = false)
		private User patient;

		@ManyToOne
		@JoinColumn(name = "vaccine", referencedColumnName = "id", nullable = false)
		private Vaccine vaccine;

		public SignUpForVaccine() {
			super();
		}

		public SignUpForVaccine(int id, User patient, Vaccine vaccine) {
			super();
			this.id = id;
			this.patient = patient;
			this.vaccine = vaccine;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public User getPatient() {
			return patient;
		}

		public void setPatient(User patient) {
			this.patient = patient;
		}

		public Vaccine getVaccine() {
			return vaccine;
		}

		public void setVaccine(Vaccine vaccine) {
			this.vaccine = vaccine;
		}

		@Override
		public String toString() {
			return "SignUpForVaccine [id=" + id + ", patient=" + patient + ", vaccine=" + vaccine + "]";
		}

		
		
	

}
