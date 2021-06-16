package by.epam.jonline.task_airline;

/*10. Создать класс Airline, спецификация которого приведена ниже. Определить конструкторы, set- и get- методы
и метод toString(). Создать второй класс, агрегирующий массив типа Airline, с подходящими конструкторами и
методами. Задать критерии выбора данных и вывести эти данные на консоль.
Airline: пункт назначения, номер рейса, тип самолета, время вылета, дни недели.
Найти и вывести:
a) список рейсов для заданного пункта назначения;
b) список рейсов для заданного дня недели;
c) список рейсов для заданного дня недели, время вылета для которых больше заданного.*/

public class Main {

	public static void main(String[] args) {
 		
		DataGenerator data = new DataGenerator();
		int countOfLine = 10;
		
		Airport airport = new Airport("Minsk - International", data.createAirport(countOfLine));
		
		UserLogic choose = new UserLogic(airport);
		
		choose.operation();

	}

}
