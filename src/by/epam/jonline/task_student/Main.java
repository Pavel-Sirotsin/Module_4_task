package by.epam.jonline.task_student;

import java.util.List;

/*3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Main {

	public static void main(String[] args) {
		int countOfStudent = 10;

		DataCreator dc = new DataCreator();
		Group group = new Group("ФПМ-1", 31, dc.generateStudentList(countOfStudent));

		StudentLogic logic = new StudentLogic();
		StudentView view = new StudentView();
		
		List<Student> result = logic.findTheBest(group.getBase());
		view.printResult(result);

	}

}
