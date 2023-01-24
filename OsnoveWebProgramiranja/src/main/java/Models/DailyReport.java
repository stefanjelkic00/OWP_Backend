package models;

import java.time.LocalDateTime;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

public class DailyReport {



		@Id
		@GeneratedValue(strategy = GenerationType.IDENTITY)
		private int id;


		private int numberOfSickFromLastDay;


		private int numberOfTestedFromLastDay;


		private int numberOfSickSincePandemic;
		private int numberOfHositalizedPeople;

		
		private int numberOfPeopleOnRespirators;

		
		private LocalDateTime DateOfUploading;


		public DailyReport() {
			super();
		}


		public DailyReport(int id, int numberOfSickFromLastDay, int numberOfTestedFromLastDay,
				int numberOfSickSincePandemic, int numberOfHositalizedPeople, int numberOfPeopleOnRespirators,
				LocalDateTime dateOfUploading) {
			super();
			this.id = id;
			this.numberOfSickFromLastDay = numberOfSickFromLastDay;
			this.numberOfTestedFromLastDay = numberOfTestedFromLastDay;
			this.numberOfSickSincePandemic = numberOfSickSincePandemic;
			this.numberOfHositalizedPeople = numberOfHositalizedPeople;
			this.numberOfPeopleOnRespirators = numberOfPeopleOnRespirators;
			DateOfUploading = dateOfUploading;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public int getNumberOfSickFromLastDay() {
			return numberOfSickFromLastDay;
		}


		public void setNumberOfSickFromLastDay(int numberOfSickFromLastDay) {
			this.numberOfSickFromLastDay = numberOfSickFromLastDay;
		}


		public int getNumberOfTestedFromLastDay() {
			return numberOfTestedFromLastDay;
		}


		public void setNumberOfTestedFromLastDay(int numberOfTestedFromLastDay) {
			this.numberOfTestedFromLastDay = numberOfTestedFromLastDay;
		}


		public int getNumberOfSickSincePandemic() {
			return numberOfSickSincePandemic;
		}


		public void setNumberOfSickSincePandemic(int numberOfSickSincePandemic) {
			this.numberOfSickSincePandemic = numberOfSickSincePandemic;
		}


		public int getNumberOfHositalizedPeople() {
			return numberOfHositalizedPeople;
		}


		public void setNumberOfHositalizedPeople(int numberOfHositalizedPeople) {
			this.numberOfHositalizedPeople = numberOfHositalizedPeople;
		}


		public int getNumberOfPeopleOnRespirators() {
			return numberOfPeopleOnRespirators;
		}


		public void setNumberOfPeopleOnRespirators(int numberOfPeopleOnRespirators) {
			this.numberOfPeopleOnRespirators = numberOfPeopleOnRespirators;
		}


		public LocalDateTime getDateOfUploading() {
			return DateOfUploading;
		}


		public void setDateOfUploading(LocalDateTime dateOfUploading) {
			DateOfUploading = dateOfUploading;
		}


		@Override
		public String toString() {
			return "DailyReport [id=" + id + ", numberOfSickFromLastDay=" + numberOfSickFromLastDay
					+ ", numberOfTestedFromLastDay=" + numberOfTestedFromLastDay + ", numberOfSickSincePandemic="
					+ numberOfSickSincePandemic + ", numberOfHositalizedPeople=" + numberOfHositalizedPeople
					+ ", numberOfPeopleOnRespirators=" + numberOfPeopleOnRespirators + ", DateOfUploading="
					+ DateOfUploading + "]";
		}

		

}
