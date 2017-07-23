package FactoryMethod;

public class Application {
    private DroidSelector droidSelector = new DroidSelector();

    public Application() {
        run();
    }

    public void run(){
        droidSelector.getDroid(DroidType.AMERICAN_DROID).fight();
        droidSelector.getDroid(DroidType.GERMANY_DROID).move();
        droidSelector.getDroid(DroidType.UKRAINE_DROID).fight();
    }
}
