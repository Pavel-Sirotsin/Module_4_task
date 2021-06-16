package by.epam.jonline.task_airline;

/*10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

import by.epam.jonline.task_time.Time;

public class Airline {
	private String destination;
	private String flightN;
	private String plane;
	private Time departTime;

	public Airline() {
		super();
	}

	public Airline(String destination, String flightN, String plane, int day, int hour, int minute) {
		super();
		this.destination = destination;
		this.flightN = flightN;
		this.plane = plane;
		this.departTime = new Time.Builder(day).hour(hour).minute(minute).build();
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getFlightN() {
		return flightN;
	}

	public void setFlightN(String flightN) {
		this.flightN = flightN;
	}

	public String getPlane() {
		return plane;
	}

	public void setPlane(String plane) {
		this.plane = plane;
	}

	public Time getDepartTime() {
		return departTime;
	}

	public void setDepartTime(Time departTime) {
		this.departTime = departTime;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((departTime == null) ? 0 : departTime.hashCode());
		result = prime * result + ((destination == null) ? 0 : destination.hashCode());
		result = prime * result + ((flightN == null) ? 0 : flightN.hashCode());
		result = prime * result + ((plane == null) ? 0 : plane.hashCode());
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
		Airline other = (Airline) obj;
		if (departTime == null) {
			if (other.departTime != null)
				return false;
		} else if (!departTime.equals(other.departTime))
			return false;
		if (destination == null) {
			if (other.destination != null)
				return false;
		} else if (!destination.equals(other.destination))
			return false;
		if (flightN == null) {
			if (other.flightN != null)
				return false;
		} else if (!flightN.equals(other.flightN))
			return false;
		if (plane == null) {
			if (other.plane != null)
				return false;
		} else if (!plane.equals(other.plane))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Airline - Destination: %-11s Flight: %-7s Plane: %-21s Depart %-7s", destination,
				flightN, plane, departTime);
	}

}
