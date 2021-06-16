package by.epam.jonline.task_train;

import java.util.ArrayList;
import java.util.List;

public class DataCreator {
	private String genStation(int i) {
		String[] station = { "Patterson", "Croton Falls", "Springdale", "Patterson", "Rowayton", "Patterson",
				"Patterson", "Patterson", "Harrison", "St.Pancras" };
		return station[i];
	}

	private int genNumber() {
		return (int) (Math.random() * 100);
	}

	private int genDay() {
		return (int) (Math.random() * 7);
	}

	public List<Train> createSchedule(int countOfTrains) {
		List<Train> schedule = new ArrayList<Train>();
		for (int i = 0; i < countOfTrains; i++) {
			schedule.add(new Train(genStation(i), genNumber(), genDay(), genNumber(), genNumber()));
		}
		return schedule;
	}

}
