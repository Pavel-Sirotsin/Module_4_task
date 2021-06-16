package by.epam.jonline.task_counter;

import java.util.Random;

public class Roulette {
	private int sum;
	private String spinResult;
	private String bet;

	public Roulette() {
		super();
	}

	public Roulette(int sum) {
		super();
		this.sum = sum;
	}

	public String getBet() {
		return bet;
	}

	public void setBet(String bet) {
		this.bet = bet;
	}

	public int getSum() {
		return sum;
	}

	public String getSpinResult() {
		return spinResult;
	}

	public void setSum(int sum) {
		this.sum = sum;
	}

	public void setSpinResult(String spinResult) {
		this.spinResult = spinResult;
	}

	public void spin() {
		Random rand = new Random();
		String value = Integer.toString(1 + rand.nextInt(5));
		this.spinResult = value;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bet == null) ? 0 : bet.hashCode());
		result = prime * result + ((spinResult == null) ? 0 : spinResult.hashCode());
		result = prime * result + sum;
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
		Roulette other = (Roulette) obj;
		if (bet == null) {
			if (other.bet != null)
				return false;
		} else if (!bet.equals(other.bet))
			return false;
		if (spinResult == null) {
			if (other.spinResult != null)
				return false;
		} else if (!spinResult.equals(other.spinResult))
			return false;
		if (sum != other.sum)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return String.format("Roulette - Totall win: %d | Result Of spin: %s | Bet: %s", sum, spinResult, bet);
	}

}
