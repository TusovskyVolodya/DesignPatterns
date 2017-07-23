package Decorator;

public class RepairDroid extends DroidDecorator {
    public RepairDroid(Droid droid) {
        super(droid);
    }

    @Override
    public void move() {
        super.move();
        System.out.println("RepairDroid is moving and find broken droids!");
    }

    @Override
    public void doSmth() {
        super.doSmth();
        System.out.println("RepairDroid is fixing droids!");

    }
}
