package br.com.cod3r.strategy.worker;

import br.com.cod3r.strategy.worker.strategies.eat.EatStrategy;
import br.com.cod3r.strategy.worker.strategies.transportation.TransportationStrategy;
import br.com.cod3r.strategy.worker.strategies.work.WorkStrategy;

public class Person {

    private EatStrategy eatStrategy;
    private TransportationStrategy transportationStrategy;
    private WorkStrategy workStrategy;
    private String name;


    public Person(final EatStrategy eatStrategy, final TransportationStrategy transportationStrategy, final WorkStrategy workStrategy, final String name) {
        this.eatStrategy = eatStrategy;
        this.transportationStrategy = transportationStrategy;
        this.workStrategy = workStrategy;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void eat() {
        this.eatStrategy.eat();
    }

    public void move() {
        this.transportationStrategy.move();
    }

    public void work() {
        this.workStrategy.work();
    }
}
