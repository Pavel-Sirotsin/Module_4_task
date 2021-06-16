package by.epam.jonline.task_student;

import java.util.ArrayList;
import java.util.List;

public class DataCreator {
	private String genName(int n) {
		String[] initials = { "Гришаева А.В.", "Моргунов И.К.", "Сверидова А.К.", "Пушкин А.С.", "Зеновьев К.B.",
				"Горбачев Л.C.", "Брежнева Л.И.", "Barkly J.", "Armstrong L.", "Абдул-Рахман Р." };
		return initials[n];
	}

	private int[] genGrade(int n) {
		int[] mas = new int[n];

		for (int i = 0; i < mas.length; i++) {
			mas[i] = 8 + (int) (Math.random() * 3);
		}

		return mas;
	}

	public List<Student> generateStudentList(int countOfStudent) {
		List<Student> list = new ArrayList<Student>();
		for (int i = 0; i < countOfStudent; i++) {
			list.add(new Student(i, genName(i), genGrade(Student.PERFOMANCE)));
		}
		return list;
	}

}
