package Prototype;

public class Main {
    public static void main(String[] args) {
        DroidCashe.loadCache();

        Droid clonedDroid = DroidCashe.getDroid("1");
        clonedDroid.doSmth();

        Droid clonedDroid2 = DroidCashe.getDroid("2");
        clonedDroid2.doSmth();

        Droid clonedDroid3 = DroidCashe.getDroid("3");
        clonedDroid3.doSmth();

    }

    }

