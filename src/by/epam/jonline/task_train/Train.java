/*4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train:
1) добавьте возможность сортировки элементов массива по номерам поездов.
2) добавьте возможность вывода информации о поезде, номер которого введен пользователем.
3) добавьте возможность сортировки массива по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.*/

package by.epam.jonline.task_train;

import by.epam.jonline.task_time.Time;

public class Train implements Comparable<Train> {

	private String station;
	private int trainN;
	private Time departTime;

	public Train() {
		super();
	}

	public Train(String station, int trainN, int day, int hour, int minute) {
		super();
		this.station = station;
		this.trainN = trainN;
		this.departTime = new Time.Builder(day).hour(hour).minute(minute).build();
	}

	public String getStation() {
		return station;
	}

	public void setStation(String station) {
		this.station = station;
	}

	public int getTrainN() {
		return trainN;
	}

	public void setTrainN(int trainN) {
		this.trainN = trainN;
	}

	public Time getDepartTime() {
		return departTime;
	}

	public void setDepartTime(Time departTime) {
		this.departTime = departTime;
	}

	@Override
	public int compareTo(Train o) {
		if (this.trainN < o.trainN)
			return -1;
		if (this.trainN > o.trainN)
			return 1;
		return 0;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departTime == null) ? 0 : departTime.hashCode());
		result = prime * result + ((station == null) ? 0 : station.hashCode());
		result = prime * result + trainN;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Train other = (Train) obj;
		if (departTime == null) {
			if (other.departTime != null)
				return false;
		} else if (!departTime.equals(other.departTime))
			return false;
		if (station == null) {
			if (other.station != null)
				return false;
		} else if (!station.equals(other.station))
			return false;
		if (trainN != other.trainN)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Train №: %-5d Station: %-15s Depart time: %s", trainN, station, departTime);
	}

}
