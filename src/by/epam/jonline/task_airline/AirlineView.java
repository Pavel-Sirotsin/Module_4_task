package by.epam.jonline.task_airline;

import java.util.List;

public class AirlineView {

	public void printInfo() {
		System.out.println("Select a number of operation: \r\n" + "1) Sort by destination.\r\n"
				+ "2) Sort by the flight day.\r\n" + "3) Sort By the day and time of flight." + "\r\n" + "4) \"Exit\"");
	}

	public void printDestenation() {
		System.out.println("Amsterdam|Baltimore|Buffalo|Atlanta|Austin|Hartford|Charlotte\r");
		System.out.println("Enter punkt of destination (can be partly) >>");
	}

	public void printTimeTable(List<Airline> mas) {
		System.out.printf("%50s\n", "*** Time Table***");
		for (Airline a : mas) {
			System.out.println(a);
		}
		System.out.println();
	}

	public void requestDay() {
		System.out.println("Enter the flight day that you are interested in(can be partly) >>");
	}

	public void requestTime() {
		System.out.println("Enter the hours of flight HH(24h) >>");
	}

	public void printResult(List<Airline> list) {
		if (list.size() == 0) {
			System.out.println("Does not exist!");
		} else {
			for (Airline airline : list) {
				System.out.println(airline);
			}
		}
	}

	public void seeYou() {
		System.out.println("See you later alligator :)");
	}
}
