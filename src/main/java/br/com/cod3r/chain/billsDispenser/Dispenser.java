package br.com.cod3r.chain.billsDispenser;

public class Dispenser {
	private Bill chain;

	public Dispenser() {
		this(new Bill(100), new Bill(50), new Bill(25), new Bill(10), new Bill(5), new Bill(1));
	}

	public Dispenser(Bill... bills) {
		for (int index = 0; index < bills.length -1; index++) {
			final Bill bill = bills[index];
			bill.setNext(bills[index + 1]);
		}
		chain = bills[0];
	}

	public void withdraw(Integer ammount) {
		chain.execute(ammount);
	}
}
