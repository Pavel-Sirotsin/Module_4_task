package by.epam.jonline.task_car;

public class Engine {
	private boolean turnOn;
	private int power;
	private String engineType;
	private double avrConsumtion;

	public Engine() {
		super();
	}

	public Engine(String engineType, int power, double avrConsumtion) {
		super();
		this.power = power;
		this.engineType = engineType;
		this.avrConsumtion = avrConsumtion;
	}

	public boolean isTurnOn() {
		return turnOn;
	}

	public void setTurnOn(boolean turnOn) {
		this.turnOn = turnOn;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public String getEngineType() {
		return engineType;
	}

	public void setEngineType(String engineType) {
		this.engineType = engineType;
	}

	public double getAvrConsumtion() {
		return avrConsumtion;
	}

	public void setAvrConsumtion(double avrConsumtion) {
		this.avrConsumtion = avrConsumtion;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		long temp;
		temp = Double.doubleToLongBits(avrConsumtion);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((engineType == null) ? 0 : engineType.hashCode());
		result = prime * result + power;
		result = prime * result + (turnOn ? 1231 : 1237);
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
		Engine other = (Engine) obj;
		if (Double.doubleToLongBits(avrConsumtion) != Double.doubleToLongBits(other.avrConsumtion))
			return false;
		if (engineType == null) {
			if (other.engineType != null)
				return false;
		} else if (!engineType.equals(other.engineType))
			return false;
		if (power != other.power)
			return false;
		if (turnOn != other.turnOn)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Engine: %s | Power: %d PH | Started: %b", engineType, power, turnOn);
	}

}
