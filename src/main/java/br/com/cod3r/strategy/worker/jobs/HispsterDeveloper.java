package br.com.cod3r.strategy.worker.jobs;

import br.com.cod3r.strategy.worker.strategies.eat.KetogenicFoodStrategy;
import br.com.cod3r.strategy.worker.strategies.transportation.BikeStrategy;
import br.com.cod3r.strategy.worker.strategies.work.DeveloperStrategy;

public class HispsterDeveloper implements Worker {

	@Override
	public void eat() {
		new KetogenicFoodStrategy().eat();
	}

	@Override
	public void move() {
		new BikeStrategy().move();
	}

	@Override
	public void work() {
		new DeveloperStrategy().work();
	}

}
