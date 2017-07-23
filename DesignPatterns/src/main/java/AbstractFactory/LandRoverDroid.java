package AbstractFactory;

public class LandRoverDroid implements MoveDroid {
    public void move() {
        System.out.println("LandRoverDroid is moving!");
    }

    public void stop() {
        System.out.println("LandRoverDroid is stop!");
    }
}
