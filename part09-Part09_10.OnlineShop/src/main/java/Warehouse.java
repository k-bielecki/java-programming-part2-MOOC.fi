import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Warehouse {
    private Map<String, Integer> productPrice;
    private Map<String, Integer> productStock;

    public Warehouse() {
        this.productPrice = new HashMap<>();
        this.productStock = new HashMap<>();
    }

    public void addProduct(String product, int price, int stock) {
        productPrice.put(product, price);
        productStock.put(product, stock);
    }
    public int price(String product) {
        return productPrice.getOrDefault(product, -99);
    }
    public int stock(String product) {
        return productStock.getOrDefault(product, 0);
    }
    public boolean take(String product) {
        if (productStock.getOrDefault(product, 0) > 0) {
            productStock.put(product, productStock.get(product) - 1);
            return true;
        } else return false;
    }
    public Set<String> products() {
        return productPrice.keySet();
    }
}
