public class SedanCarFactory extends CarFactory {
    public Engine createEngine() {
        return new V6Engine();
    }

    public Wheels createWheels() {
        return new StandardWheels();
    }

    public Interior createInterior() {
        return new LeatherInterior();
    }
}