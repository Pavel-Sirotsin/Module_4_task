package by.epam.jonline.task_car;

public class Wheel {
	private final String[] POSITION = { "FL", "FR", "RL", "RR" };
	private String position;
	private double pressure;
	final static double RECOMENDED_PRESSURE = 2.2;

	public Wheel() {
		super();
	}

	public Wheel(int index, double pressure) {
		super();
		this.position = POSITION[index];
		this.pressure = pressure;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((position == null) ? 0 : position.hashCode());
		long temp;
		temp = Double.doubleToLongBits(pressure);
		result = prime * result + (int) (temp ^ (temp >>> 32));
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
		Wheel other = (Wheel) obj;
		if (position == null) {
			if (other.position != null)
				return false;
		} else if (!position.equals(other.position))
			return false;
		if (Double.doubleToLongBits(pressure) != Double.doubleToLongBits(other.pressure))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Wheel - pressure: %.2f | position: %s", pressure, position);
	}

}
