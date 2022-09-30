package br.com.cod3r.observer.party.observers;

public class Friend implements Observer {

	public void sendGift() {
		System.out.println("Look, I bought your favorite beer!");
	}

	@Override
	public void update(final boolean status) {
		if(status) {
			sendGift();
		} else {
			System.out.println("Sleep...");
		}
	}
}