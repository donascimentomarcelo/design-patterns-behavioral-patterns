package br.com.cod3r.strategy.worker;

import br.com.cod3r.strategy.worker.strategies.eat.KetogenicFoodStrategy;
import br.com.cod3r.strategy.worker.strategies.eat.MeatFoodStrategy;
import br.com.cod3r.strategy.worker.strategies.transportation.AirplaneStrategy;
import br.com.cod3r.strategy.worker.strategies.transportation.BikeStrategy;
import br.com.cod3r.strategy.worker.strategies.work.DeveloperStrategy;
import br.com.cod3r.strategy.worker.strategies.work.PilotStrategy;

public class Client2 {

	public static void presentYourself(Person person) {
		System.out.println("Hi, I'm " + person.getName());
		person.eat();
		person.move();
		person.work();
		System.out.println("----------------");
	}
	
	public static void main(String[] args) {
		Person john = new Person(new MeatFoodStrategy(), new BikeStrategy(), new DeveloperStrategy(), "Jhon");
		presentYourself(john);

		Person ann = new Person(new KetogenicFoodStrategy(), new AirplaneStrategy(), new PilotStrategy(), "Ann");
		presentYourself(ann);

		Person carol = new Person(new MeatFoodStrategy(), new BikeStrategy(), new DeveloperStrategy(), "carol");
		presentYourself(carol);
	}
}
