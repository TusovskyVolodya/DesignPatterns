package Decorator;

public class DroidDecorator implements Droid {
    Droid droid;

    public DroidDecorator(Droid droid) {
        this.droid = droid;
    }

    public void move() {
        droid.move();
    }

    public void doSmth() {
        droid.move();
    }
}
