package by.epam.jonline.task_bill;

import java.util.List;

public class UserLogic {
	private UserInput input = new UserInput();
	private BillLogic analyzer = new BillLogic();
	private UserView view = new UserView();
	private String key;
	private Bank bank;

	public UserLogic() {
		super();
	}

	public UserLogic(Bank bank) {
		super();
		this.bank = bank;
	}

	public void operation() {
		view.printIfo();
		key = input.select();
		variant();
	}

	private void variant() {

		switch (key) {
		case "1": {
			view.printCase_1();
			String lastNumbers = input.lastBillDigit();
			List<Bill> bill = analyzer.findBill(lastNumbers, bank.getClientBase());
			view.printBill(bill);
			break;
		}
		case "2": {
			view.printCase_2(bank.getClientBase());
			String lastNumbers = input.lastBillDigit();
			List<Bill> bill = analyzer.findBill(lastNumbers, bank.getClientBase());
			analyzer.lockBill(bill);
			view.printBill(bill);
			break;
		}
		case "3": {
			analyzer.sortByBalnce(bank.getClientBase());
			System.out.println(bank);
			break;
		}
		case "4": {
			for (Client client : bank.getClientBase()) {
				double amount = analyzer.calculateTotal(client);
				view.printAmount(client, amount);
			}
			break;
		}
		case "5": {
			for (Client client : bank.getClientBase()) {
				double amount = analyzer.calculateNegative(client);
				view.printNegative(client, amount);
			}

			break;
		}
		case "6": {
			for (Client client : bank.getClientBase()) {
				double amount = analyzer.calculatePositive(client);
				view.printPositive(client, amount);
			}

			break;
		}
		case "7": {
			view.printCase_7();
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}

	}

}
