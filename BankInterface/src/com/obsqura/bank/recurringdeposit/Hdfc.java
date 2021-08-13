package com.obsqura.bank.recurringdeposit;

public class Hdfc implements RBI {

	int totalamount;

	@Override
	public void recurringDeposit(int amount, int duration) {
		totalamount = amount * (1 + rateofinterest * duration);
		System.out.println("\nRate of interest is: " + rateofinterest + "\nThe amount after " + duration
				+ " years for the principal " + amount + " is: " + totalamount);

	}
}