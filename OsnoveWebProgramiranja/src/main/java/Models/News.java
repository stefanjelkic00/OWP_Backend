package models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class News {
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		private String naziv;
		private String sadrzaj;
		@Column(columnDefinition = "TIMESTAMP")
		private LocalDateTime datumVremeObjavljivanja;
		public News() {
			super();
		}
		public News(int id, String naziv, String sadrzaj, LocalDateTime datumVremeObjavljivanja) {
			super();
			this.id = id;
			this.naziv = naziv;
			this.sadrzaj = sadrzaj;
			this.datumVremeObjavljivanja = datumVremeObjavljivanja;
		}
		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getNaziv() {
			return naziv;
		}
		public void setNaziv(String naziv) {
			this.naziv = naziv;
		}
		public String getSadrzaj() {
			return sadrzaj;
		}
		public void setSadrzaj(String sadrzaj) {
			this.sadrzaj = sadrzaj;
		}
		public LocalDateTime getDatumVremeObjavljivanja() {
			return datumVremeObjavljivanja;
		}
		public void setDatumVremeObjavljivanja(LocalDateTime datumVremeObjavljivanja) {
			this.datumVremeObjavljivanja = datumVremeObjavljivanja;
		}
		@Override
		public String toString() {
			return "News [id=" + id + ", naziv=" + naziv + ", sadrzaj=" + sadrzaj + ", datumVremeObjavljivanja="
					+ datumVremeObjavljivanja + "]";
		}
		
		
	}


