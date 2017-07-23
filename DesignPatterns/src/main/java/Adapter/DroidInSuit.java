package Adapter;

public class DroidInSuit {
    public static void main(String[] args) {
        SimpleDroid simpleDroid = new DroidAdapter();
        simpleDroid.move();
        simpleDroid.shoot();
    }
}
