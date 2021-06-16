package by.epam.jonline.task_train;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import by.epam.jonline.task_time.Time;

public class TrainLogic {

	public void sortTrainNumber(List<Train> data) {
		Collections.sort(data);
	}

	public void sortByDest(List<Train> data) {
		Collections.sort(data, new Comparator<Train>() {

			@Override
			public int compare(Train o1, Train o2) {
				return o1.getStation().compareTo(o2.getStation());
			}

		});

		point: for (int i = 0, n = data.size(); i < n; i++) {
			String destFirst = data.get(i).getStation();

			for (int j = i + 1; j < data.size(); j++) {
				String destSecond = data.get(j).getStation();

				if (destFirst.equals(destSecond)) {
					Time timeFirst = data.get(i).getDepartTime();
					Time timeSecond = data.get(j).getDepartTime();

					if (timeFirst.compareTo(timeSecond) > 0) {
						Train temp = data.get(i);
						data.set(i, data.get(j));
						data.set(j, temp);
					}
				} else
					continue point;

			}

		}
	}

	public Train findTrain(List<Train> data, int value) {

		for (Train t : data) {
			if (value == t.getTrainN())
				return t;
		}
		return null;
	}

}
