package Decorator;

public class BattleDroid extends DroidDecorator {
    public BattleDroid(Droid droid) {
        super(droid);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("BattleDroid is flying on jetpack!");
    }

    @Override
    public void doSmth() {
        super.doSmth();
        System.out.println("BattleDroid is doSmth blusters!");
    }
}
