package com.example.OsnoveWebProgramiranja.models;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;


@Entity
public class Vaccine {
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		private int availableSupply;
		
		@ManyToOne
		@JoinColumn(name = "producer", referencedColumnName = "id", nullable = false)
		private VaccineProducer vaccineProducer;

		public Vaccine() {
			super();
		}

		public Vaccine(int id, String name, int availableSupply, VaccineProducer vaccineProducer) {
			super();
			this.id = id;
			this.name = name;
			this.availableSupply = availableSupply;
			this.vaccineProducer = vaccineProducer;
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

		public int getAvailableSupply() {
			return availableSupply;
		}

		public void setAvailableSupply(int availableSupply) {
			this.availableSupply = availableSupply;
		}

		public VaccineProducer getVaccineProducer() {
			return vaccineProducer;
		}

		public void setVaccineProducer(VaccineProducer vaccineProducer) {
			this.vaccineProducer = vaccineProducer;
		}

		@Override
		public String toString() {
			return "Vaccine [id=" + id + ", name=" + name + ", availableSupply=" + availableSupply + "]";
		}

		
		
		
}
