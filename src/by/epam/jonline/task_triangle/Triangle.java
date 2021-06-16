package by.epam.jonline.task_triangle;

import java.util.*;

/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.*/

public class Triangle {

	private int[] sideA;
	private int[] sideB;
	private int[] sideC;

	public Triangle() {
		super();
	}

	public Triangle(int[] sideA, int[] sideB, int[] sideC) {
		super();
		this.sideA = sideA;
		this.sideB = sideB;
		this.sideC = sideC;
	}

	public int[] getSideA() {
		return sideA;
	}

	public int[] getSideB() {
		return sideB;
	}

	public int[] getSideC() {
		return sideC;
	}

	public void setSideA(int[] sideA) {
		this.sideA = sideA;
	}

	public void setSideB(int[] sideB) {
		this.sideB = sideB;
	}

	public void setSideC(int[] sideC) {
		this.sideC = sideC;
	}

	@Override
	public String toString() {
		return String.format("Triangle: A%s B%s C%s", Arrays.toString(sideA), Arrays.toString(sideB),
				Arrays.toString(sideC));
	}

}
