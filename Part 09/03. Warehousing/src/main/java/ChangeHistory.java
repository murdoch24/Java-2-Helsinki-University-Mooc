import java.util.ArrayList;
import java.util.Arrays;

public class ChangeHistory {
    
    private ArrayList<Double> history;
    
    public ChangeHistory(){
        this.history = new ArrayList<>();
    }
    
    public void add(double status){
        this.history.add(status);
    }
    
    public void clear(){
        this.history.clear();
    }
    
    public double maxValue(){
        double maxValue = this.history.get(0);
        
        if (this.history.isEmpty()){
            return 0;
        }
        
        for (double number : this.history){
            if (number > maxValue){
                maxValue = number;
            }
        }
        
        return maxValue;
    }
    
    public double minValue(){
        double minValue = this.history.get(0);
        
        if (this.history.isEmpty()){
            return 0;
        }
        
        for (double number : this.history){
            if (number < minValue){
                minValue = number;
            }
        }
        
        return minValue;
        
    }
    
    public double average(){
        
        double sum = 0.0;
        double count = 0.0;
        
        if (this.history.isEmpty()){
            return 0;
        }
        
        for (double number: this.history){
            count ++;
            sum = sum + number;
        }
        
        return sum / count;
        

        
    }
    
    @Override
    public String toString(){
        return Arrays.toString(this.history.toArray());
    }
    
}
