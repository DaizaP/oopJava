package com.example.oopjava.Seminar2.Homework.Task2;

public interface QueueBehaviour {
    void takeInQueue(Actor actor);
    void takeOrders();
    void GiveOrders();
    void releaseFromQueue();
}
