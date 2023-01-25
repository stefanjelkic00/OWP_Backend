package com.example.OsnoveWebProgramiranja.services;

import com.example.OsnoveWebProgramiranja.dto.DailyReportDTO;

public interface DailyReportService {
	public void createDailyReport(DailyReportDTO dailyReportdto);

	public DailyReportDTO lastreport();
}
