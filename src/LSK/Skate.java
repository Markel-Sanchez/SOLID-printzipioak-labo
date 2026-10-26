package LSK;

class Skate extends TransportationDevice implements IMotorduna {
    private Engine engine;
    
    @Override
    public void startEngine() { engine.hasieratua=true; }
    
    @Override
    public Engine getEngine() { return engine; }
}