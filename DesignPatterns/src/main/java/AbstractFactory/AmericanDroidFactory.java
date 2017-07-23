package AbstractFactory;

public class AmericanDroidFactory implements DroidFactory {
    public MoveDroid createMoveDroid() {
        return new LandRoverDroid();
    }

    public FlyDroid createFlyDroid() {
        return new BoeingDroid();
    }
}
