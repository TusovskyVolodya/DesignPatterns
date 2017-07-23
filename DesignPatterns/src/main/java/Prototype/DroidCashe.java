package Prototype;

import java.util.Hashtable;

public class DroidCashe {
    private static Hashtable<String, Droid> droidMap  = new Hashtable<String, Droid>();

    public static Droid getDroid(String droidId) {
        Droid cachedDroid = droidMap.get(droidId);
        try {
            return (Droid) cachedDroid.clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return cachedDroid;
    }

    public static void loadCache() {
       SimpleDroid simpleDroid = new SimpleDroid();
        simpleDroid.setId("1");
        droidMap.put(simpleDroid.getId(),simpleDroid);

        BattleDroid battleDroid = new BattleDroid();
        battleDroid.setId("2");
        droidMap.put(battleDroid.getId(),battleDroid);

        RepairDroid repairDroid = new RepairDroid();
        repairDroid.setId("3");
        droidMap.put(repairDroid.getId(), repairDroid);
    }
}
