package com.example.OsnoveWebProgramiranja.models;

import java.time.LocalDateTime;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class News {
	

		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;
		
		private String name;
		
		private String content;
		
		@Column(columnDefinition = "TIMESTAMP")
		private LocalDateTime dateAndTimeOfUpload;
		
		
		public News() {
			super();
		}
		public News(int id, String name, String content, LocalDateTime dateAndTimeOfUpload) {
			super();
			this.id = id;
			this.name = name;
			this.content = content;
			this.dateAndTimeOfUpload = dateAndTimeOfUpload;
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
		public String getContent() {
			return content;
		}
		public void setContent(String content) {
			this.content = content;
		}
		public LocalDateTime getDateAndTimeOfUpload() {
			return dateAndTimeOfUpload;
		}
		public void setDateAndTimeOfUpload(LocalDateTime dateAndTimeOfUpload) {
			this.dateAndTimeOfUpload = dateAndTimeOfUpload;
		}
	
		
		

}