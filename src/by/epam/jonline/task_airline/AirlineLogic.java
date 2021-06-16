package by.epam.jonline.task_airline;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AirlineLogic {

	public List<Airline> sortByDestination(List<Airline> data, String regex) {
		List<Airline> result = new ArrayList<Airline>();

		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher;

		for (Airline a : data) {
			String input = a.getDestination();
			matcher = pattern.matcher(input);

			if (matcher.find()) {
				result.add(a);
			}
		}
		return result;

	}

	public List<Airline> sortByDay(List<Airline> data, String regex) {
		List<Airline> result = new ArrayList<Airline>();

		Pattern pattern = Pattern.compile(regex, Pattern.CASE_INSENSITIVE);
		Matcher matcher;

		for (Airline a : data) {
			String input = a.getDepartTime().getDayOfWeek();
			matcher = pattern.matcher(input);
			if (matcher.find()) {
				result.add(a);
			}
		}
		return result;

	}

	public List<Airline> sortByDayTime(List<Airline> data, String dayOfWeek, int time) {
		List<Airline> result = new ArrayList<Airline>();

		Pattern pattern = Pattern.compile(dayOfWeek, Pattern.CASE_INSENSITIVE);
		Matcher matcher;

		for (Airline a : data) {
			String day = a.getDepartTime().getDayOfWeek();
			int tableTime = a.getDepartTime().getHour();

			matcher = pattern.matcher(day);

			if (matcher.find() && tableTime > time) {
				result.add(a);
			}
		}

		return result;
	}

}
