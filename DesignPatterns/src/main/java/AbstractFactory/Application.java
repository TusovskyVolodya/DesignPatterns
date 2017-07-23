package AbstractFactory;

public class Application {
    public Application() {
        run();
    }

    public void run(){
        UkraineDroidFactory ukraineDroidFactory = new UkraineDroidFactory();
        ukraineDroidFactory.createFlyDroid().flight();
        ukraineDroidFactory.createMoveDroid().move();
        AmericanDroidFactory americanDroidFactory = new AmericanDroidFactory();
        americanDroidFactory.createFlyDroid().flight();
        americanDroidFactory.createMoveDroid().move();
    }
}
