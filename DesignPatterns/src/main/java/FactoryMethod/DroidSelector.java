package FactoryMethod;

public class DroidSelector {
    private Droid droid = null;
    public Droid getDroid(DroidType droidType){
        switch (droidType){
            case GERMANY_DROID:
                droid = new GermanyDroid();
                break;
            case UKRAINE_DROID:
                droid = new UkraineDroid();
                break;
            case AMERICAN_DROID:
                droid = new AmericanDroid();
                break;
        }
        return droid;
    }
}
