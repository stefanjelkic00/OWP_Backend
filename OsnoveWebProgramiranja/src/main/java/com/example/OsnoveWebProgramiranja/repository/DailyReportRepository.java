package com.example.OsnoveWebProgramiranja.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.OsnoveWebProgramiranja.models.DailyReport;

@Repository
public interface DailyReportRepository extends JpaRepository<DailyReport, Integer> {


}
