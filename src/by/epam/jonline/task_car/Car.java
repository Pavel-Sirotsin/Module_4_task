package by.epam.jonline.task_car;

import java.util.Arrays;

/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/

public class Car {
	private String brand;
	private Engine engine;
	private Tank tank;
	private double range;
	private int odometry;
	public final static int COUNT_OF_WHEEL = 4;
	private Wheel[] allWheel = new Wheel[COUNT_OF_WHEEL];

	public Car(String brand, Engine engine, Tank tank) {
		super();
		this.brand = brand;
		this.engine = engine;
		this.tank = tank;
	}

	public void setEngine(Engine engine) {
		this.engine = engine;
	}

	public void setTank(Tank tank) {
		this.tank = tank;
	}

	public Wheel[] getAllWheel() {
		return allWheel;
	}

	public void setAllWheel(Wheel[] allWheel) {
		this.allWheel = allWheel;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getBrand() {
		return this.brand;
	}

	public Tank getTank() {
		return tank;
	}

	public Engine getEngine() {
		return engine;
	}

	public double getRange() {
		return range;
	}

	public void setRange(double range) {
		this.range = range;
	}

	public int getOdometry() {
		return odometry;
	}

	public void setOdometry(int odometry) {
		this.odometry = odometry;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + Arrays.hashCode(allWheel);
		result = prime * result + ((brand == null) ? 0 : brand.hashCode());
		result = prime * result + ((engine == null) ? 0 : engine.hashCode());
		result = prime * result + odometry;
		long temp;
		temp = Double.doubleToLongBits(range);
		result = prime * result + (int) (temp ^ (temp >>> 32));
		result = prime * result + ((tank == null) ? 0 : tank.hashCode());
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
		Car other = (Car) obj;
		if (!Arrays.equals(allWheel, other.allWheel))
			return false;
		if (brand == null) {
			if (other.brand != null)
				return false;
		} else if (!brand.equals(other.brand))
			return false;
		if (engine == null) {
			if (other.engine != null)
				return false;
		} else if (!engine.equals(other.engine))
			return false;
		if (odometry != other.odometry)
			return false;
		if (Double.doubleToLongBits(range) != Double.doubleToLongBits(other.range))
			return false;
		if (tank == null) {
			if (other.tank != null)
				return false;
		} else if (!tank.equals(other.tank))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Car: %s | Odometry: %d  | Range(km): %.2f\n%s\n%s", brand, odometry, range, engine, tank);
	}

}