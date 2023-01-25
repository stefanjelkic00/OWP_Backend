package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.News;

@Repository
public interface NewsRepository extends JpaRepository<News, Integer>{

}
