package by.epam.jonline.task_car;


public class CarLogic {
	private Car car;

	public CarLogic(Car car) {
		super();
		this.car = car;
	}

	public String drive(Engine engine, int km) {
		if (car.getEngine().isTurnOn() == false) {
			return "Engine turned off!";
		} else if (car.getTank().getTankLevel() <= 0) {
			return "Low fuel!";
		} else {
			double range = (car.getTank().getTankLevel() / engine.getAvrConsumtion()) * 100;
			car.setRange(range);
			car.setOdometry(km);
			return "Let's go!";
		}

	}

	public String refuel(int litre) {
		car.getTank().setTankLevel(litre);

		if (car.getTank().getTankLevel() == car.getTank().getTankVolume()) {
			return "Full level!";

		} else if (car.getTank().getTankLevel() > car.getTank().getTankVolume()) {
			int result = car.getTank().getTankLevel() - car.getTank().getTankVolume();
			return String.format("Overflow: %d", result);

		} else
			return String.format("Tank is filled up: %d", litre);
	}

	public String installWheel(double... pressure) {
		for (int i = 0; i < car.getAllWheel().length; i++) {
			car.getAllWheel()[i] = new Wheel(i, pressure[i]);
		}

		return "Wheels are installed!";
	}

	public int checkWheel() {
		int count = 0;
		
		for (Wheel w : car.getAllWheel()) {
			if (w.getPressure() != Wheel.RECOMENDED_PRESSURE) {
				w.setPressure(Wheel.RECOMENDED_PRESSURE);
				count++;
			}
		}

		return count;
	}

}
