
import java.util.ArrayList;


public class OneItemBox extends Box{
    
    private int capacity;
    private ArrayList<Item> item;
    
    public OneItemBox(){
        this.capacity = 1;
        this.item = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        
        if (isFree()){
            this.item.add(item);
        }
        
    }

    @Override
    public boolean isInBox(Item item){
        return this.item.contains(item);

    }
    
    public boolean isFree(){
        
        return (this.item.isEmpty());

    }
    
}
