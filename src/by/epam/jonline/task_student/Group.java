package by.epam.jonline.task_student;

import java.util.List;

public class Group {
	private String name;
	private int countOfStudent;
	private List<Student> base;

	public Group() {
		super();
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getCountOfStudent() {
		return countOfStudent;
	}

	public void setCountOfStudent(int countOfStudent) {
		this.countOfStudent = countOfStudent;
	}

	public List<Student> getBase() {
		return base;
	}

	public void setBase(List<Student> base) {
		this.base = base;
	}

	public Group(String name, int countOfStudent, List<Student> base) {
		super();
		this.name = name;
		this.countOfStudent = countOfStudent;
		this.base = base;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder("Group - ");
		sb.append("Название: " + name);
		sb.append(" | Количество студентов: " + countOfStudent);
		for (Student student : base) {
			sb.append(student + "\n");
		}
		return sb.toString();
	}

}
