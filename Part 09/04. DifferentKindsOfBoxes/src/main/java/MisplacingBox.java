
import java.util.ArrayList;


public class MisplacingBox extends Box {
    
    private ArrayList<Item> item;
    
    public MisplacingBox(){
        this.item = new ArrayList<>();
    }
    
    @Override
    public void add(Item item){
        this.item.add(item);
    }
    
    @Override
    public boolean isInBox(Item item){
        return false;
    }
    
}
