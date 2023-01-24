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
		private String name;
		private String content;
		@Column(columnDefinition = "TIMESTAMP")
		private LocalDateTime dateOfUpload;
		public News() {
			super();
		}
		public News(int id, String name, String content, LocalDateTime dateOfUpload) {
			super();
			this.id = id;
			this.name = name;
			this.content = content;
			this.dateOfUpload = dateOfUpload;
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
		public LocalDateTime getDateOfUpload() {
			return dateOfUpload;
		}
		public void setDateOfUpload(LocalDateTime dateOfUpload) {
			this.dateOfUpload = dateOfUpload;
		}
		@Override
		public String toString() {
			return "News [id=" + id + ", name=" + name + ", content=" + content + ", dateOfUpload=" + dateOfUpload
					+ "]";
		}
	

}