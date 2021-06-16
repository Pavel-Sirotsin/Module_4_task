/*5. Опишите класс, реализующий десятичный счетчик, который может увеличивать или уменьшать свое значение
на единицу в заданном диапазоне. Предусмотрите инициализацию счетчика значениями по умолчанию и
произвольными значениями. Счетчик имеет методы увеличения и уменьшения состояния, и метод
позволяющее получить его текущее состояние.
1) написать код, демонстрирующий все возможности класса.*/

package by.epam.jonline.task_counter;

public class Counter {

	private int minVal;
	private int maxVal;
	private int currentVal;
	private int circle;
	private int increasing;
	private int decreasing;
	
	public Counter() {
		super();
	}

	public Counter(int minVal, int maxVal, int currentVal, int circle) {
		super();
		this.maxVal = maxVal;
		this.minVal = minVal;

		while (currentVal > maxVal) {
			circle++;
			currentVal -= maxVal;

		}

		if (circle >= 0)
			this.circle = circle;

		this.currentVal = currentVal;
	}

	public void setCircle(int circle) {
		if (circle >= 0)
			this.circle = circle;

	}

	public int getCircle() {
		return circle;
	}

	public int getCurrentVal() {
		return currentVal;
	}

	public void setCurrentVal(int currentVal) {
		while (currentVal > maxVal) {
			currentVal -= maxVal;
			circle++;
		}
		this.currentVal = currentVal;
	}

	public int getMinVal() {
		return minVal;
	}

	public int getMaxVal() {
		return maxVal;
	}

	public void setMinVal(int minVal) {
		this.minVal = minVal;
	}

	public void setMaxVal(int maxVal) {
		this.maxVal = maxVal;
	}

	public int getIncreasing() {
		return increasing;
	}

	public int getDecreasing() {
		return decreasing;
	}

	public void setIncreasing(int increasing) {
		this.increasing = increasing;
	}

	public void setDecreasing(int decreasing) {
		this.decreasing = decreasing;
	}

	public void up() {
		currentVal++;

		while (currentVal > maxVal) {
			currentVal -= maxVal;
			circle++;
		}
	}

	public void up(int step) {
		currentVal += step;

		while (currentVal > maxVal) {
			currentVal -= maxVal;
			circle++;
		}
	}

	public void down() {
		currentVal--;

		if (currentVal < minVal && circle == 0)
			currentVal = minVal;
		while (currentVal < minVal && circle > 0) {
			circle--;
			currentVal += maxVal;
		}
	}

	public void down(int step) {
		currentVal -= step;

		if (currentVal < minVal && circle == 0)
			currentVal = minVal;

		while (currentVal < minVal && circle > 0) {
			circle--;
			currentVal += maxVal;
		}

	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + circle;
		result = prime * result + currentVal;
		result = prime * result + decreasing;
		result = prime * result + increasing;
		result = prime * result + maxVal;
		result = prime * result + minVal;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Counter other = (Counter) obj;
		if (circle != other.circle)
			return false;
		if (currentVal != other.currentVal)
			return false;
		if (decreasing != other.decreasing)
			return false;
		if (increasing != other.increasing)
			return false;
		if (maxVal != other.maxVal)
			return false;
		if (minVal != other.minVal)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format(
				"Counter - Minimum: %d | Maximum: %d | Current value: %d | Circles: %d | Increasing: %d | Decreasing",
				minVal, maxVal, currentVal, circle, increasing, decreasing);
	}

}
