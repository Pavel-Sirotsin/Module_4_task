package by.epam.jonline.task_state;

import java.util.List;

/*3. Создать объект класса Государство, используя классы Область, Район, Город. Методы: вывести на консоль
столицу, количество областей, площадь, областные центры.*/

public class Polity {
	private double square;
	private String theCapital;
	private List<Region> regions;

	public Polity() {
		super();
	}

	public Polity(double square, String theCapital, List<Region> regions) {
		super();
		this.square = square;
		this.theCapital = theCapital;
		this.regions = regions;
	}

	public double getSquare() {
		return square;
	}

	public void setSquare(double square) {
		this.square = square;
	}

	public String getTheCapital() {
		return theCapital;
	}

	public void setTheCapital(String theCapital) {
		this.theCapital = theCapital;
	}

	public List<Region> getRegions() {
		return regions;
	}

	public void setRegions(List<Region> regions) {
		this.regions = regions;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((regions == null) ? 0 : regions.hashCode());
		long temp;
		temp = Double.doubleToLongBits(square);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((theCapital == null) ? 0 : theCapital.hashCode());
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
		Polity other = (Polity) obj;
		if (regions == null) {
			if (other.regions != null)
				return false;
		} else if (!regions.equals(other.regions))
			return false;
		if (Double.doubleToLongBits(square) != Double.doubleToLongBits(other.square))
			return false;
		if (theCapital == null) {
			if (other.theCapital != null)
				return false;
		} else if (!theCapital.equals(other.theCapital))
			return false;
		return true;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Polity: " + theCapital);
		sb.append(" | Площадь: " + square + "\n");
		for (Region r : regions) {
			sb.append(r);
		}
		return sb.toString();
	}

}
