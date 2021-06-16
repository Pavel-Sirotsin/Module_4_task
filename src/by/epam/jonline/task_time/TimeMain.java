package by.epam.jonline.task_time;

/*6. Составьте описание класса для представления времени. Предусмотрте возможности установки времени и
изменения его отдельных полей (час, минута, секунда) с проверкой допустимости вводимых значений. В случае
недопустимых значений полей поле устанавливается в значение 0. Создать методы изменения времени на
заданное количество часов, минут и секунд.*/

public class TimeMain {

	public static void main(String[] args) {

		Time time = new Time.Builder(6).hour(23).minute(200).second(300).build();
		System.out.println(time);


	}

}
