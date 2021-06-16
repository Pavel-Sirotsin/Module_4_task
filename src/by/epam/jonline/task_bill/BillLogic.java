package by.epam.jonline.task_bill;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BillLogic {

	public List<Bill> findBill(String suffix, List<Client> base) {
		List<Bill> result = new ArrayList<Bill>();

		for (Client c : base) {
			for (Bill b : c.getBillData()) {
				if (b.getNumber().endsWith(suffix)) {
					result.add(b);
				}
			}
		}
		return result;
	}

	public void lockBill(List<Bill> list) {

		for (Bill bill : list) {
			bill.setBlocked(true);
		}

	}

	public void sortByBalnce(List<Client> base) {
		for (Client client : base) {
			Collections.sort(client.getBillData());
		}
	}

	public double calculateTotal(Client client) {
		double amount = 0;

		for (Bill b : client.getBillData()) {
			Currency currency = b.getСurrency();
			double sum = b.getSum();
			
			switch (currency) {
			case USD: {
				amount += currency.multiply(sum);
				break;
			}
			case EUR: {
				amount += currency.multiply(sum);
				break;
			}
			case GBP: {
				amount += currency.multiply(sum);
				break;
			}
			case PLN: {
				amount += currency.multiply(sum);
				break;
			}
			case BYR: {
				amount += b.getSum();
				break;
			}
			default:
				throw new IllegalArgumentException("Unexpected value: " + currency);
			}
		}
		return amount;
	}

	public double calculateNegative(Client client) {
		double amount = 0;
		

		for (Bill b : client.getBillData()) {
			Currency currency = b.getСurrency();
			double sum = b.getSum();
			
			if (sum < 0) {
				switch (currency) {
				case USD: {
					amount += currency.multiply(sum);
					break;
				}
				case EUR: {
					amount += currency.multiply(sum);
					break;
				}
				case GBP: {
					amount += currency.multiply(sum);
					break;
				}
				case PLN: {
					amount += currency.multiply(sum);
					break;
				}
				case BYR: {
					amount += b.getSum();
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + currency);
				}
			}
		}
		return amount;
	}

	public double calculatePositive(Client client) {
		double amount = 0;

		for (Bill b : client.getBillData()) {
			Currency currency = b.getСurrency();
			double sum = b.getSum();
			
			if (sum > 0) {
				switch (currency) {
				case USD: {
					amount += currency.multiply(sum);
					break;
				}
				case EUR: {
					amount += currency.multiply(sum);
					break;
				}
				case GBP: {
					amount += currency.multiply(sum);
					break;
				}
				case PLN: {
					amount += currency.multiply(sum);
					break;
				}
				case BYR: {
					amount += b.getSum();
					break;
				}
				default:
					throw new IllegalArgumentException("Unexpected value: " + currency);
				}
			}
		}
		return amount;
	}

}
