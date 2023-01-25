package com.example.OsnoveWebProgramiranja.dto;



public class DailyReportDTO {
	
	private int numberOfSickPeopleSincePandemicStart;
	
	private int numberOfLastDaySickPeople;
	
	private int numberOfPeopleOnRepsirators;
	
	private int numberOfLastDayTestedPeople;
	
	private int numberOfHosipalizedPeople;
	
	private String DateAndTimeOfPost;

	public DailyReportDTO() {
		super();
	}

	public DailyReportDTO(int numberOfSickPeopleSincePandemicStart, int numberOfLastDaySickPeople,
			int numberOfPeopleOnRepsirators, int numberOfLastDayTestedPeople, int numberOfHosipalizedPeople,
			String dateAndTimeOfPost) {
		super();
		this.numberOfSickPeopleSincePandemicStart = numberOfSickPeopleSincePandemicStart;
		this.numberOfLastDaySickPeople = numberOfLastDaySickPeople;
		this.numberOfPeopleOnRepsirators = numberOfPeopleOnRepsirators;
		this.numberOfLastDayTestedPeople = numberOfLastDayTestedPeople;
		this.numberOfHosipalizedPeople = numberOfHosipalizedPeople;
		DateAndTimeOfPost = dateAndTimeOfPost;
	}

	public int getNumberOfSickPeopleSincePandemicStart() {
		return numberOfSickPeopleSincePandemicStart;
	}

	public void setNumberOfSickPeopleSincePandemicStart(int numberOfSickPeopleSincePandemicStart) {
		this.numberOfSickPeopleSincePandemicStart = numberOfSickPeopleSincePandemicStart;
	}

	public int getNumberOfLastDaySickPeople() {
		return numberOfLastDaySickPeople;
	}

	public void setNumberOfLastDaySickPeople(int numberOfLastDaySickPeople) {
		this.numberOfLastDaySickPeople = numberOfLastDaySickPeople;
	}

	public int getNumberOfPeopleOnRepsirators() {
		return numberOfPeopleOnRepsirators;
	}

	public void setNumberOfPeopleOnRepsirators(int numberOfPeopleOnRepsirators) {
		this.numberOfPeopleOnRepsirators = numberOfPeopleOnRepsirators;
	}

	public int getNumberOfLastDayTestedPeople() {
		return numberOfLastDayTestedPeople;
	}

	public void setNumberOfLastDayTestedPeople(int numberOfLastDayTestedPeople) {
		this.numberOfLastDayTestedPeople = numberOfLastDayTestedPeople;
	}

	public int getNumberOfHosipalizedPeople() {
		return numberOfHosipalizedPeople;
	}

	public void setNumberOfHosipalizedPeople(int numberOfHosipalizedPeople) {
		this.numberOfHosipalizedPeople = numberOfHosipalizedPeople;
	}

	public String getDateAndTimeOfPost() {
		return DateAndTimeOfPost;
	}

	public void setDateAndTimeOfPost(String dateAndTimeOfPost) {
		DateAndTimeOfPost = dateAndTimeOfPost;
	}
	
	
	
	
	
	
}
