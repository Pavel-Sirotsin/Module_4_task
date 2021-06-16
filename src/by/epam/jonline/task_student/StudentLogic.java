package by.epam.jonline.task_student;

import java.util.ArrayList;
import java.util.List;

public class StudentLogic {
	public List<Student> findTheBest(List<Student> list) {
		List<Student> best = new ArrayList<Student>();

		boolean result = false;

		for (Student student : list) {
			result = mark(student.getAcadPerf());

			if (result == true) {
				best.add(student);
			}
		}
		if (result)
			return best;
		else
			return null;
	}

	private boolean mark(int[] mas) {
		for (int i = 0; i < mas.length; i++) {
			if (mas[i] < 9)
				return false;
		}
		return true;
	}
}
