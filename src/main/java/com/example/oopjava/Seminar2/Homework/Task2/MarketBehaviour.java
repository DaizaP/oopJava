package com.example.oopjava.Seminar2.Homework.Task2;

import java.util.List;

public interface MarketBehaviour {
    void acceptToMarket(Actor actor);
    void releaseFromMarket(List<Actor> actor);
    void update();
}
