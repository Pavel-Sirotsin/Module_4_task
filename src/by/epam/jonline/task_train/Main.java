package by.epam.jonline.task_train;


/*4. Создайте класс Train, содержащий поля: название пункта назначения, номер поезда, время отправления.
Создайте данные в массив из пяти элементов типа Train, добавьте возможность сортировки элементов массива по
номерам поездов. Добавьте возможность вывода информации о поезде, номер которого введен пользователем.
Добавьте возможность сортировки массив по пункту назначения, причем поезда с одинаковыми пунктами
назначения должны быть упорядочены по времени отправления.*/

public class Main {

	public static void main(String[] args) {
		DataCreator data = new DataCreator();
		int countOfTrains = 10;

		Depo depo = new Depo("Minsk - Passengers'", data.createSchedule(countOfTrains)); 

		TrainLogic logic = new TrainLogic();
		TrainView view = new TrainView();
		UserInput input = new UserInput();

		System.out.println("**** Sorted by train number ****");
		logic.sortTrainNumber(depo.getSchedule());
		view.printTimeTable(depo);

		System.out.println("**** Sorted by destination and time in duplicate names****");
		logic.sortByDest(depo.getSchedule());
		view.printTimeTable(depo);

		System.out.println("**** Choosing train by number ****");
		view.printTrainNumber(depo);
		int val = input.trainNumber();
		Train exist = logic.findTrain(depo.getSchedule(), val);
		view.printResult(exist);

	}

}
