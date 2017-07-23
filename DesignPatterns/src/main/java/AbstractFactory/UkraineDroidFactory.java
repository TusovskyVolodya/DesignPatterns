package AbstractFactory;

public class UkraineDroidFactory implements DroidFactory {
    public MoveDroid createMoveDroid() {
        return new ZazDroid();
    }

    public FlyDroid createFlyDroid() {
        return new TyDroid();

    }
}
