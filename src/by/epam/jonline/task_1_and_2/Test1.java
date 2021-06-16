package by.epam.jonline.task_1_and_2;

/*1. Создайте класс Test1 двумя переменными. Добавьте метод вывода на экран и методы изменения этих
переменных. Добавьте метод, который находит сумму значений этих переменных, и метод, который находит
наибольшее значение из этих двух переменных.*/

public class Test1 {

	private int i;
	private int n;

	public int getI() {
		return i;
	}

	public int getN() {
		return n;
	}

	public void setI(int i) {
		this.i = i;
	}

	public void setN(int n) {
		this.n = n;
	}

	public int sum() {
		return this.i + this.n;
	}

	public int biggest() {
		return Math.max(this.i, this.n);
	}

	@Override
	public String toString() {
		return getClass().getName() + "i:" + i + " | n:" + n;
	}

	
}
