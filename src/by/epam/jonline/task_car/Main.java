package by.epam.jonline.task_car;

/*2. Создать объект класса Автомобиль, используя классы Колесо, Двигатель. Методы: ехать, заправляться,
менять колесо, вывести на консоль марку автомобиля.*/

public class Main {

	public static void main(String[] args) {
		Engine engine = new Engine("2GR-FSE", 250, 8.0);
		Tank tank = new Tank(60, 0);
		Car car = new Car("Lexus", engine, tank);

		CarLogic can = new CarLogic(car);

		String resultWheel = can.installWheel(2.5, 2.2, 2.2, 0);
		System.out.println(resultWheel);

		String resultTank = can.refuel(50);
		System.out.println(resultTank);

		engine.setTurnOn(true);

		int resultCheck = can.checkWheel();
		System.out.println(resultCheck + " wheel(s) is(are) cheked and fixed!");

		String resultCar = can.drive(engine, 100);
		System.out.println(resultCar);
		System.out.println(car);
	}

}
