package by.epam.jonline.task_car;

public class Tank {
	private int tankVolume;
	private int tankLevel;

	public Tank() {
		super();
	}

	public Tank(int tankVolume, int tankLevel) {
		super();
		this.tankVolume = tankVolume;
		this.tankLevel = tankLevel;
	}

	public int getTankVolume() {
		return tankVolume;
	}

	public int getTankLevel() {
		return tankLevel;
	}

	public void setTankValume(int tankVolume) {
		this.tankVolume = tankVolume;
	}

	public void setTankLevel(int tankLevel) {
		this.tankLevel = tankLevel;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + tankLevel;
		result = prime * result + tankVolume;
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
		Tank other = (Tank) obj;
		if (tankLevel != other.tankLevel)
			return false;
		if (tankVolume != other.tankVolume)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Tank: %d liters  | level: %d ", tankVolume, tankLevel);
	}

}
