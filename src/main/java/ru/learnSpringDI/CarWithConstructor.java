package ru.learnSpringDI;

public class CarWithConstructor {
    private Engine engine;
    public CarWithConstructor(Engine engine) {
        this.engine = engine;
    }
    public Engine getEngine() {
        return engine;
    }
}
