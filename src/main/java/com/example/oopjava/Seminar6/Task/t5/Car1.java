package com.example.oopjava.Seminar6.Task.t5;

interface Engine {
    void start();

    void stop();
}

class Car1 {
    private Engine engine;

    public Car1(Engine engine) {
        this.engine = engine;
    }

    public void start() {
        engine.start();
    }

    public void stop() {
        engine.stop();
    }
}

class GasolineEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Gasoline engine started");
    }

    @Override
    public void stop() {
        System.out.println("Gasoline engine stopped");
    }
}

class ElectricEngine implements Engine {

    @Override
    public void start() {
        System.out.println("Electric engine started");
    }

    @Override
    public void stop() {
        System.out.println("Electric engine stopped");
    }
}

class Main {
    public static void main(String[] args) {
        Engine gasolineEngine = new GasolineEngine();
        Car1 car1 = new Car1(gasolineEngine);
        car1.start();

        Engine electricEngine = new ElectricEngine();
        Car1 car2 = new Car1(electricEngine);
        car2.start();
    }
}
