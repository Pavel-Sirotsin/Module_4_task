package by.epam.jonline.task_train;

public class TrainView {

	public void printResult(Train exist) {
		if (exist == null)
			System.out.println("Такого поезда нет в списке!");
		else
			System.out.println(exist);
	}

	public void printTimeTable(Depo data) {
		for (Train t : data.getSchedule()) {
			System.out.println(t);
		}
		System.out.println();
	}

	public void printTrainNumber(Depo data) {
		for (Train t : data.getSchedule()) {
			System.out.print(t.getTrainN() + " | ");
		}
		System.out.println("\nВведите номер поезда: >>");

	}

}
