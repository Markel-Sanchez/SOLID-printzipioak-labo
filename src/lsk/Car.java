package lsk;


class Car extends TransportationDevice implements IMotorduna, IMatrikuladuna {
    private Engine engine;
    
    @Override
    public void startEngine() { engine.hasieratua=true; }
    
    @Override
    public Engine getEngine() { return engine; }
    
    @Override
    public void matrikulatu() { /* ... */ }
}