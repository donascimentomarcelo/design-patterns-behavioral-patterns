package br.com.cod3r.chain.billsDispenser;

public class Client {

	public static void main(String[] args) {
		Dispenser atm = new Dispenser();
		atm.withdraw(230);
		System.out.println("-----230------");
		atm.withdraw(66);
		System.out.println("------66-----");
	}
}
