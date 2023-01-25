package com.example.OsnoveWebProgramiranja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OsnoveWebProgramiranja.models.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer>{

}
