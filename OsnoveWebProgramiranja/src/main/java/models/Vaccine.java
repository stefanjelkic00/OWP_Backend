package models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;

public class Vaccine {
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String ime;
		private int dostupnaKolicina;
		
		@ManyToOne
		@JoinColumn(name = "proizvodjac", referencedColumnName = "id", nullable = false)
		private VaccineProducer vaccineProducer;

		public Vaccine() {
			super();
		}

		public Vaccine(int id, String ime, int dostupnaKolicina, VaccineProducer vaccineProducer) {
			super();
			this.id = id;
			this.ime = ime;
			this.dostupnaKolicina = dostupnaKolicina;
			this.vaccineProducer = vaccineProducer;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getIme() {
			return ime;
		}

		public void setIme(String ime) {
			this.ime = ime;
		}

		public int getDostupnaKolicina() {
			return dostupnaKolicina;
		}

		public void setDostupnaKolicina(int dostupnaKolicina) {
			this.dostupnaKolicina = dostupnaKolicina;
		}

		public VaccineProducer getVaccineProducer() {
			return vaccineProducer;
		}

		public void setVaccineProducer(VaccineProducer vaccineProducer) {
			this.vaccineProducer = vaccineProducer;
		}

		@Override
		public String toString() {
			return "Vaccine [id=" + id + ", ime=" + ime + ", dostupnaKolicina=" + dostupnaKolicina + "]";
		}
	
		
		
}
