package com.example.OsnoveWebProgramiranja.services;

import java.util.List;

import com.example.OsnoveWebProgramiranja.dto.NewsDTO;

public interface NewsService {
	
	
	public List<NewsDTO> allNews();
	
	
	public void createNews(NewsDTO newsDTO);

	
}
