package by.epam.jonline.task_counter;

public class GameProcess {
	private Counter counter = new Counter(0, 10, 150, 0);
	private UserInput input = new UserInput();
	private UserView view = new UserView();
	

	public void play(Roulette roulette) {
		int sum = counter.getCurrentVal() + (counter.getCircle() * counter.getMaxVal());
		roulette.setSum(sum);
		view.menuInfo(roulette);

		while (roulette.getSum() > 0) {
			roulette.spin();
			roulette.setBet(input.makeBet(view));

			if (roulette.getBet().equals("stop"))
				break;
			else
				checkResult(roulette, roulette.getBet());

		}
		if (roulette.getSum() == 0)
			view.thatsAll();
		else if (roulette.getSum() < 0)
			view.owed(roulette);
		else
			view.winner(roulette);
	}

	public void checkResult(Roulette roulette, String value) {
		counter.setIncreasing(40);
		counter.setDecreasing(20);
		int stepUp = counter.getIncreasing();
		int stepDown = counter.getDecreasing();
		int sum;
		if (roulette.getSpinResult().equals(value)) {
			counter.up(stepUp);
			sum = counter.getCurrentVal() + (counter.getCircle() * counter.getMaxVal());
			roulette.setSum(sum);
			view.win(roulette.getSum());
		} else {
			counter.down(stepDown);
			sum = counter.getCurrentVal() + counter.getCircle() * counter.getMaxVal();
			roulette.setSum(sum);
			view.loose(roulette.getSum());
		}
	}
}
