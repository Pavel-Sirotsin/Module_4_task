package by.epam.jonline.task_triangle;

public class TriangleLogic {
	private Triangle triangle;

	public TriangleLogic() {
		super();
	}

	public TriangleLogic(Triangle triangle) {
		super();
		this.triangle = triangle;
	}

	public double square() {
		int[] A = triangle.getSideA();
		int[] B = triangle.getSideB();
		int[] C = triangle.getSideC();

		double s = (A[0] - C[0]) * (B[1] - C[1]);
		s -= (B[0] - C[0]) * (A[1] - C[1]);
		s = Math.abs(s / 2);
		return s;
	}

	public double perimeter() {
		int[] A = triangle.getSideA();
		int[] B = triangle.getSideB();
		int[] C = triangle.getSideC();

		double AB = Math.hypot(B[0] - A[0], B[1] - A[1]);
		AB = Math.abs(AB);

		double BC = Math.hypot(C[0] - B[0], C[1] - B[1]);
		BC = Math.abs(BC);

		double AC = Math.hypot(C[0] - A[0], C[1] - A[1]);
		AC = Math.abs(BC);

		double P = AB + BC + AC;

		return P;
	}

	public double[] centroid() {
		int[] A = triangle.getSideA();
		int[] B = triangle.getSideB();
		int[] C = triangle.getSideC();

		double x = (A[0] + B[0] + C[0]) / 3.0;
		double y = (A[1] + B[1] + C[1]) / 3.0;
		double[] O = { x, y };
		return O;
	}
}
