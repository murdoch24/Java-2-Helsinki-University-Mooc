
import java.util.ArrayList;
import java.util.HashMap;


public class VehicleRegistry {
    
    private HashMap<LicensePlate, String> registry;
    
    public VehicleRegistry(){
        this.registry = new HashMap<>();    
    }
    
    public boolean add(LicensePlate licensePlate, String owner){
        if (!registry.containsKey(licensePlate)){
            this.registry.put(licensePlate, owner);
            return true;
        }else{
            return false;
        }
        
    }
    
    public String get(LicensePlate licensePlate){
        return this.registry.get(licensePlate);
    }
    
    public boolean remove(LicensePlate licensePlate){
        
        if (!registry.containsKey(licensePlate)){
            return false;
        }else{
            this.registry.remove(licensePlate);
            return true;
            
        }
        
    }
    
    public void printLicensePlates(){
        
        for (LicensePlate plate : registry.keySet()){
            System.out.println(plate);
        }
        
    }
    
    public void printOwners(){
        
        ArrayList<String> ownersPrinted = new ArrayList<>();
        
        for (LicensePlate plate: registry.keySet()){
            String owner = registry.get(plate);
            if (!ownersPrinted.contains(owner)){
                ownersPrinted.add(owner);
                System.out.println(owner);
            }
            
        }

   }
    
}
