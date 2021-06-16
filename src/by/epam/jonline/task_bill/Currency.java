package by.epam.jonline.task_bill;

public enum Currency {
	USD(840, 2.51), EUR(978, 3.07), GBP(826, 3.58), PLN(985, 0.65), BYR(933,1);

	private int code;
	private double rate;

	private Currency(int code, double rate) {
		this.code = code;
		this.rate = rate;
	}

	public int getCode() {
		return code;
	}

	public void setCode(int code) {
		this.code = code;
	}

	public double getRate() {
		return rate;
	}

	public void setRate(double rate) {
		this.rate = rate;
	}
	
	public double multiply(double sum) {
		return sum * this.rate;
	}
	
	@Override
	public String toString() {
	return String.format("Currency - %s Code: %d | Rate: %.2f", name(), code, rate);
	}

}
