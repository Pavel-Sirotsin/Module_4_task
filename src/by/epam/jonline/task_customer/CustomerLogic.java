package by.epam.jonline.task_customer;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CustomerLogic {
	public void sortByInitials(List<Customer> list) {
		Collections.sort(list);
	}

	public List<Customer> sortByCard(List<Customer> base) {
		List<Customer> cardList = new ArrayList<>();
		boolean exist = false;
		int val;
		int cardEndFrom = 800;
		int cardEndTo = 1000;
		for (Customer customer : base) {
			val = (int) (customer.getCardN() % 1000);
			if (val > cardEndFrom && val < cardEndTo) {
				cardList.add(customer);
				exist = true;
			}
		}
		if (!exist)
			return null;
		else
			return cardList;
	}

}
