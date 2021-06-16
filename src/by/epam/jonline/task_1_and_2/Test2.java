package by.epam.jonline.task_1_and_2;

/*2. Создйте класс Test2 двумя переменными. Добавьте конструктор с входными параметрами. Добавьте
конструктор, инициализирующий члены класса по умолчанию. Добавьте set- и get- методы для полей экземпляра
класса.*/

public class Test2 {

	String i;
	double n;

	public Test2() {
		super();
	}

	public Test2(String i, double n) {
		super();
		this.i = i;
		this.n = n;
	}

	public String getI() {
		return i;
	}

	public double getN() {
		return n;
	}

	public void setI(String i) {
		this.i = i;
	}

	public void setN(double n) {
		this.n = n;
	}

	@Override
	public String toString() {
		return getClass().getName() + "i:" + i + " | n: " + n;
	}
	
	

}
