package by.epam.jonline.task_airline;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {

	public String genDestination(int i) {
		String[] mas = { "Amsterdam", "Baltimore", "Buffalo", "Atlanta", "Austin", "Hartford", "Charlotte", "Atlanta",
				"Hartford", "Amsterdam" };

		return mas[i];
	}

	public String genPlane(int i) {
		String[] mas = { "Airbus A350", "Boeing 747", "Airbus A380", "Boeing 737", "Bombardier DHC 8",
				"Embraer Praetor 500", "Boeing 737", "Embraer 175", "Embraer 175", "Embraer Praetor 500" };

		return mas[i];
	}

	public String genFlight() {
		int firstLetter;
		int lastLetter;

		firstLetter = 65 + (int) (Math.random() * 25);
		lastLetter = 65 + (int) (Math.random() * 25);
		String randF = (char) firstLetter + "" + (char) lastLetter + "" + (int) (Math.random() * 2000);

		return randF;
	}

	private int genNumber() {
		return (int) (Math.random() * 100);
	}

	private int genDay() {
		return (int) (Math.random() * 7);
	}

	public List<Airline> createAirport(int countOfLine) {
		List<Airline> list = new ArrayList<>();
		for (int i = 0; i < countOfLine; i++) {
			list.add(new Airline(genDestination(i), genFlight(), genPlane(i), genDay(), genNumber(), genNumber()));
		}
		return list;
	}

}
