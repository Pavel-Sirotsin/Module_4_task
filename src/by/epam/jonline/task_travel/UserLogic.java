package by.epam.jonline.task_travel;

import java.util.List;

public class UserLogic {
	private String key;
	private TravelAgency agency;
	private UserInput input = new UserInput();
	private UserView view = new UserView();
	private VoucherLogic logic = new VoucherLogic();

	public UserLogic() {
		super();
	}

	public UserLogic(TravelAgency data) {
		super();
		this.agency = data;
	}

	public void chooseOperation() {
		view.printInfo();
		key = input.select();
		variant();
	}

	private void variant() {

		switch (key) {
		case "1": {
			logic.sortByPrice(agency.getBase());
			view.printBase(agency);
			break;
		}
		case "2": {
			logic.sortByDuration(agency.getBase());

			break;
		}
		case "3": {
			logic.sortByType(agency.getBase());
			view.printBase(agency);
			break;
		}
		case "4": {
			view.printBase(agency);
			view.printType(agency.getBase());

			int key = Integer.parseInt(input.type());
			List<Voucher> result = logic.checkType(key, agency.getBase());

			view.printPrice();
			int max = input.digit();

			view.printDuration();
			int day = input.digit();

			view.printFeeding();
			String feed = input.feed();

			Voucher voucher = logic.checkTour(max, day, feed, result);
			view.printVoucher(voucher);
			break;
		}

		case "5": {
			break;
		}
		default:
			throw new IllegalArgumentException("Unexpected value: " + key);
		}
	}

}
