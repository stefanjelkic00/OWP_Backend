package modelUtils;

import java.time.LocalDateTime;

import models.User;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import models.Vaccine;

@Entity
public class PatientsRecievedVaccine {

	
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;

		@ManyToOne
		@JoinColumn(name = "pacijent", referencedColumnName = "id", nullable = false)
		private User user;

		@ManyToOne
		@JoinColumn(name = "vakcina", referencedColumnName = "id", nullable = false)
		private Vaccine vaccine;

		@Column(columnDefinition = "TIMESTAMP")
		private LocalDateTime dateOfRecievingVaccine;

		public PatientsRecievedVaccine() {
			super();
		}

		public PatientsRecievedVaccine(int id, User user, Vaccine vaccine, LocalDateTime dateOfRecievingVaccine) {
			super();
			this.id = id;
			this.user = user;
			this.vaccine = vaccine;
			this.dateOfRecievingVaccine = dateOfRecievingVaccine;
		}

		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public User getUser() {
			return user;
		}

		public void setUser(User user) {
			this.user = user;
		}

		public Vaccine getVaccine() {
			return vaccine;
		}

		public void setVaccine(Vaccine vaccine) {
			this.vaccine = vaccine;
		}

		public LocalDateTime getDateOfRecievingVaccine() {
			return dateOfRecievingVaccine;
		}

		public void setDateOfRecievingVaccine(LocalDateTime dateOfRecievingVaccine) {
			this.dateOfRecievingVaccine = dateOfRecievingVaccine;
		}

		@Override
		public String toString() {
			return "PatientsRecievedVaccine [id=" + id + ", user=" + user + ", vaccine=" + vaccine
					+ ", dateOfRecievingVaccine=" + dateOfRecievingVaccine + "]";
		}
	

		
}
