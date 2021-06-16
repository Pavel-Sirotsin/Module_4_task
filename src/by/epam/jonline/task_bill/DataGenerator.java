package by.epam.jonline.task_bill;

import java.util.ArrayList;
import java.util.List;

public class DataGenerator {
	private Bank bank;

	public DataGenerator() {
		super();
	}

	public DataGenerator(Bank bank) {
		super();
		this.bank = bank;
	}

	public String genInitials(int n) {
		String[] initials = { "Гришаева А.В.", "Моргунов И.К.", "Сверидова А.К.", "Пушкин А.С.", "Зеновьев К.B.",
				"Горбачев Л.C.", "Брежнева Л.И.", "Barkly J.", "Armstrong L.", "Абдул-Рахман Р." };
		return initials[n];
	}

	public String genAccountN() {
		String randAccount = "EN06MMBN3012";
		randAccount += (1_0000_0000_0000L + (long) (Math.random() * 1_0000_0000L));
		return randAccount;
	}

	public Currency genCurrency() {
		Currency[] mas = Currency.values();
		int rand = (int) (Math.random() * mas.length);
		return mas[rand];

	}

	public double genSum() {
		return (Math.random() * -1000) + (Math.random() * 1500);
	}

	public List<Bill> genBill() {
		int countOfBill = 1 + (int) (Math.random() * 5);
		List<Bill> bills = new ArrayList<Bill>();

		for (int i = 0; i < countOfBill; i++) {

			bills.add(new Bill(genCurrency(), genAccountN(), genSum(), false));
		}
		return bills;
	}

	public void createBank(int countOfCustomer) {
		List<Client> base = new ArrayList<Client>();

		for (int i = 0; i < countOfCustomer; i++) {
			base.add(new Client(i, genInitials(i), genBill()));
		}

		bank.setClientBase(base);
	}

}
