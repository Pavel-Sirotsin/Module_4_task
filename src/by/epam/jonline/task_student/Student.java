package by.epam.jonline.task_student;

/*3. Создайте класс с именем Student, содержащий поля: фамилия и инициалы, номер группы, успеваемость (массив
из пяти элементов). Создайте массив из десяти элементов такого типа. Добавьте возможность вывода фамилий и
номеров групп студентов, имеющих оценки, равные только 9 или 10.*/

public class Student {

	int id;
	private String initials;
	static final int PERFOMANCE = 5;
	private int[] acadPerf = new int[PERFOMANCE];

	public Student() {
		super();
	}

	public Student(int id, String initials, int[] acadPerf) {
		super();
		this.id = id;
		this.initials = initials;
		this.acadPerf = acadPerf;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getInitials() {
		return initials;
	}

	public void setInitials(String initials) {
		this.initials = initials;
	}

	public int[] getAcadPerf() {
		return acadPerf;
	}

	public void setAcadPerf(int[] acadPerf) {
		this.acadPerf = acadPerf;
	}

	public String toString() {
		StringBuilder sb = new StringBuilder("Student - ");
		sb.append("ФИО: " + initials);
		sb.append(" | Оценки: ");
		for (int p : acadPerf) {
			sb.append(p + " ");
		}
		return sb.toString();
	}

}
