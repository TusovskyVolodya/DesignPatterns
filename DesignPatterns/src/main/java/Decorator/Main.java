package Decorator;

public class Main {
    public static void main(String[] args) {
        SimpleDroid simpleDroid = new SimpleDroid();
        simpleDroid.move();
        simpleDroid.doSmth();
        BattleDroid battleDroid = new BattleDroid(new SimpleDroid());
        BattleDroid battleDroid1 = new BattleDroid(new RepairDroid(new SimpleDroid()));

        battleDroid.move();
        battleDroid.doSmth();
        battleDroid1.doSmth();


    }
}
