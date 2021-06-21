package by.epam.jonline.task_car;

import java.util.ArrayList;
import java.util.List;

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

	public String installWheel() {
		List<Wheel> list = new ArrayList<Wheel>();
		Wheel[] mas = Wheel.values();
		
		for (int i = 0; i < mas.length; i++) {
			list.add(mas[i]);
		}
		
		car.setWheels(list);

		return "Wheels are installed!";
	}

	public int checkWheel() {
		int count = 0;
		for (Wheel wheel : car.getWheels()) {
			if (wheel.getPressure() != Wheel.RECOMENDED_PRESSURE) {
				wheel.setPressure(Wheel.RECOMENDED_PRESSURE);
				count++;
			}
		}

		return count;
	}

}
