package by.epam.jonline.task_student;

import java.util.List;

public class StudentView {

	public void printResult(List<Student> result) {
		if (result != null) {
			
			for (Student student : result) {
				System.out.println(student);
			}
			
		} else
			System.out.println("В нашем списке таких студентов нет!");

	}

}
