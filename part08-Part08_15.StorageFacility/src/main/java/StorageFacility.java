import java.util.ArrayList;
import java.util.HashMap;

public class StorageFacility {

    private HashMap<String, ArrayList<String>> hashMap;

    public StorageFacility() {
        this.hashMap = new HashMap<>();
    }

    public void add (String unit, String item) {
        this.hashMap.putIfAbsent(unit, new ArrayList<>());
        this.hashMap.get(unit).add(item);
    }

    public ArrayList<String> contents (String storageUnit) {
        return hashMap.getOrDefault(storageUnit, new ArrayList<>());
    }

    public void remove (String storageUnit, String item) {
        this.hashMap.get(storageUnit).remove(item);
    }

    public ArrayList<String> storageUnits() {
        ArrayList<String> unitsList = new ArrayList<>();
        for (String unit : hashMap.keySet()) {
            if (!unitsList.contains(unit) && !hashMap.get(unit).isEmpty()) {
                unitsList.add(unit);
            }
        }
        return unitsList;
    }
}
