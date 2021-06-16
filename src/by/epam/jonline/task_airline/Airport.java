package by.epam.jonline.task_airline;

import java.util.List;

public class Airport {
	private String name;
	private List<Airline> flights;

	public Airport() {
		super();
	}

	public Airport(String name, List<Airline> flights) {
		super();
		this.name = name;
		this.flights = flights;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Airline> getFlights() {
		return flights;
	}

	public void setFlights(List<Airline> flights) {
		this.flights = flights;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((flights == null) ? 0 : flights.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		Airport other = (Airport) obj;
		if (flights == null) {
			if (other.flights != null)
				return false;
		} else if (!flights.equals(other.flights))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Airport - Flights: ", flights.toString());
	}

}
