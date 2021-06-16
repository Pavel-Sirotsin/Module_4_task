package by.epam.jonline.task_triangle;

/*7. Описать класс, представляющий треугольник. Предусмотреть методы для создания объектов, вычисления
площади, периметра и точки пересечения медиан.*/

public class TriangleMain {

	public static void main(String[] args) {

		int[] A = { 2, 1 };
		int[] B = { 1, -2 };
		int[] C = { -1, 0 };

		Triangle triangle = new Triangle(A, B, C);
		System.out.println(triangle);
		
		TriangleLogic logic = new TriangleLogic(triangle);

		double S = logic.square();
		System.out.printf("Square of triangle: %.1f\n", S);

		double P = logic.perimeter();
		System.out.printf("Perimiter: %.1f\n", P);

		double[] M = logic.centroid();
		System.out.printf("Centroid coordinates: [%.1f, %.1f]\n", M[0], M[1]);
	}

}
