package AbstractFactory;

public class ZazDroid implements MoveDroid {
    public void move() {
        System.out.println("ZazDroid is moving");
    }

    public void stop() {
        System.out.println("ZazDroid is stop");
    }
}
