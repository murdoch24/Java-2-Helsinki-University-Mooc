
import java.util.ArrayList;


public class Box implements Packable{
    
    private double capacity;
    private ArrayList<Packable> items;
    
    
    public Box(double maximumCapacity){
        this.capacity = maximumCapacity;
        this.items = new ArrayList<>();
        
    }
    
    public void add(Packable item){
        
        if (!this.isFull(item)){
            items.add(item);
        }
    }
    
    public boolean isFull(Packable item){
        return (this.weight() + item.weight() <= this.capacity); 
    }
    
    @Override
    public double weight(){
        double weight = 0.0;
        if (items.size() > 0){
            for (Packable item : items){
                weight = item.weight() + weight;
            }
        }    
        return weight;
    }
    
    @Override
    public String toString(){
        return "Box: " + this.items.size() + " items, total weight " + this.weight()
                + " kg";
    }
    
}
