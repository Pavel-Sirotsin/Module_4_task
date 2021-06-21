package by.epam.jonline.task_car;


public enum Wheel {
	FL(0), FR(0), RL(0), RR(0);

	private double pressure;
	public final static double RECOMENDED_PRESSURE = 2.2;

	private Wheel(double pressure) {
		this.pressure = pressure;
	}

	public double getPressure() {
		return pressure;
	}

	public void setPressure(double pressure) {
		this.pressure = pressure;
	}

	@Override
	public String toString() {
		return String.format("Wheel - pressure: %.2f | position: %s", pressure, name());
	}

}
