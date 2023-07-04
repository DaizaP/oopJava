package com.example.oopjava.Seminar2.Homework.Task2;

import java.util.ArrayList;
import java.util.List;

public class Market implements MarketBehaviour, QueueBehaviour{
    private Actor human = new Human();
    private List<Actor> market = new ArrayList<Actor>();
    @Override
    public void acceptToMarket(Actor actor) {
        this.market.add(human);
    }

    @Override
    public void releaseFromMarket(List<Actor> actor) {

    }

    @Override
    public void update() {

    }

    @Override
    public void takeInQueue(Actor actor) {

    }

    @Override
    public void takeOrders() {

    }

    @Override
    public void GiveOrders() {

    }

    @Override
    public void releaseFromQueue() {

    }
}
