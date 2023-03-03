import java.util.ArrayList;
        
public class BoxWithMaxWeight extends Box{
    
    private int maxWeight;
    private ArrayList<Item> items;
    
    
    public BoxWithMaxWeight(int capacity){
        this.maxWeight = capacity;
        this.items = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        if(!isFull(item.getWeight())){
            items.add(item);
            
        }
    }
    
   
    @Override
    public boolean isInBox(Item item){
        return this.items.contains(item);

    }
    
    public boolean isFull(int item){
        return (sumWeight() + item > this.maxWeight);
    }
    
    public int sumWeight(){
        int sum = 0;
        if (items.size() > 0){
            for (Item item : items){
                sum += item.getWeight();
            }
        }
        
        return sum;
    }
    

    
    
}
