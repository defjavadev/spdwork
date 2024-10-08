public class SUVCarFactory extends CarFactory {
    public Engine createEngine() {
        return new V8Engine();
    }

    public Wheels createWheels() {
        return new OffRoadWheels();
    }

    public Interior createInterior() {
        return new ClothInterior();
    }
}
