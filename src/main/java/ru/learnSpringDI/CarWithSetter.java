package ru.learnSpringDI;

public class CarWithSetter {
    private Engine engine;
    public void setEngine(Engine engine) {
        this.engine = engine;
    }
    public Engine getEngine() {
        return engine;
    }
}
