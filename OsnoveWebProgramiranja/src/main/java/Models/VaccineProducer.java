package models;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class VaccineProducer  {

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String name;
		private String country;
		public VaccineProducer() {
			super();
		}
		public VaccineProducer(int id, String name, String country) {
			super();
			this.id = id;
			this.name = name;
			this.country = country;
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
		public String getCountry() {
			return country;
		}
		public void setCountry(String country) {
			this.country = country;
		}
		@Override
		public String toString() {
			return "VaccineProducer [id=" + id + ", name=" + name + ", country=" + country + "]";
		}
		
		

	

}
