package by.epam.jonline.task_airline;

import java.util.List;

public class UserLogic {
	private String key;
	private Airport data;
	private UserInput input = new UserInput();
	private AirlineView view = new AirlineView();
	private AirlineLogic analyzer = new AirlineLogic();

	public UserLogic() {
		super();
	}

	public UserLogic(Airport data) {
		super();
		this.data = data;
	}

	public void operation() {
		view.printInfo();
		key = input.select();
		variant();
	}

	private void variant() {

		switch (key) {
		case "1": {
			view.printDestenation();
			String result = input.makeChoice();
			List<Airline> list = analyzer.sortByDestination(data.getFlights(), result);
			view.printResult(list);
			break;
		}
		case "2": {
			view.requestDay();
			String result = input.makeChoice();
			List<Airline> list = analyzer.sortByDay(data.getFlights(), result);
			view.printResult(list);
			break;
		}
		case "3": {
			view.printTimeTable(data.getFlights());
			view.requestDay();
			String day = input.makeChoice();
			view.requestTime();
			int time = input.time();
			List<Airline> list = analyzer.sortByDayTime(data.getFlights(), day, time);
			view.printResult(list);
			break;
		}
		case "4": {
			view.seeYou();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
	}

}
