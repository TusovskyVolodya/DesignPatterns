package Adapter;

public class DroidAdapter extends BattleDroidSuit implements SimpleDroid {

    public void move() {
        super.fly();
    }

    public void shoot() {
        super.shoot();
    }
}
