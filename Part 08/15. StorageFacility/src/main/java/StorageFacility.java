import java.util.HashMap;
import java.util.ArrayList;

public class StorageFacility {
    
    private HashMap<String, ArrayList<String>> storage;
    
    public StorageFacility(){
        this.storage = new HashMap<>();
    }
    
    public void add(String unit, String item){
        this.storage.putIfAbsent(unit, new ArrayList<>());
        
        ArrayList<String> items = this.storage.get(unit);
        
        items.add(item);
    }
    
    public ArrayList<String> contents(String storageUnit){
        
        if (this.storage.containsKey(storageUnit)){
            return this.storage.get(storageUnit);
        }else{
            ArrayList<String> empty = new ArrayList<>();
            return empty;
        }
        
    }
    
    public void remove(String storageUnit, String item){
        ArrayList<String> values = this.storage.get(storageUnit);
        values.remove(item);
        if (values.size() == 0){
            this.storage.remove(storageUnit);
        }
    }
    
    public ArrayList<String> storageUnits(){
        ArrayList<String> units = new ArrayList<>();
        for (String unit :  this.storage.keySet()){
            units.add(unit);
        }
        return units;
    }
    
}
