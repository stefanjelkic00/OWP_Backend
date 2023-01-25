package com.example.OsnoveWebProgramiranja.dto;

import org.springframework.lang.Nullable;

public class NewsDTO {
	
	private String name;

	private String content;
	
	private String dateAndTimeOfUpload;

	public NewsDTO() {
		super();
	}

	public NewsDTO(String name, String content, String dateAndTimeOfUpload) {
		super();
		this.name = name;
		this.content = content;
		this.dateAndTimeOfUpload = dateAndTimeOfUpload;
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

	public String getDateAndTimeOfUpload() {
		return dateAndTimeOfUpload;
	}

	public void setDateAndTimeOfUpload(String dateAndTimeOfUpload) {
		this.dateAndTimeOfUpload = dateAndTimeOfUpload;
	}
	
	
	
}
