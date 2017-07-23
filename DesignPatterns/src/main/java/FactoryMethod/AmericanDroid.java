package FactoryMethod;

public class AmericanDroid implements Droid {
    public void move() {
        System.out.println("AmericanDroid is moving");
    }

    public void fight() {
        System.out.println("AmericanDroid is fighting!");
    }
}
