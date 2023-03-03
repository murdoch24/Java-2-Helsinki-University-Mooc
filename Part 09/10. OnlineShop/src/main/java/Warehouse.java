
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    
    private Map <String, Integer> prices;
    private Map <String, Integer> stocks;
    
    public Warehouse(){
        this.prices = new HashMap<>();
        this.stocks = new HashMap<>();
    }
    
    public void addProduct(String product, int price, int stock){
        this.prices.put(product, price);
        this.stocks.put(product, stock);
    }
    
    public int price(String product){
        return this.prices.getOrDefault(product, -99);
    }
    
    public int stock(String product){
        return this.stocks.getOrDefault(product, 0);
    }
    
    public boolean take(String product){
        int currentStock = this.stocks.getOrDefault(product, 0);
        
        if (currentStock > 0){
            currentStock --;
            this.stocks.put(product, currentStock);
            return true;
        }
        return false;
    }
    
    public Set<String> products(){
        return this.stocks.keySet();
    }
}
