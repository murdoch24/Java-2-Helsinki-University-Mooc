
import java.util.HashMap;


public class IOU {
    
    private HashMap<String, Double> owes;
    
    public IOU(){
        this.owes = new HashMap<>();
        
    }
    
    public void setSum(String toWhom, double amount){
        this.owes.put(toWhom, amount);
        
    }
    
    public double howMuchDoIOweTo(String toWhom){
        
        return this.owes.getOrDefault(toWhom, 0.0);
        
        
        
    }
    
}
