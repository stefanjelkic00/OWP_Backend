package repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import models.DailyReport;

@Repository
public interface DailyReportRepository extends JpaRepository<DailyReport, Integer> {


}
