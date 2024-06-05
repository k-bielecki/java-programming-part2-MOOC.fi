import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
    private List<Item> list;

    public ShoppingCart(){
        this.list = new ArrayList<>();
    }
    public void add(String product, int price) {
        boolean ifAlreadyPresent = false;
        for (Item item : list) {
            if (item.getProduct().equals(product)) {
                item.increaseQuantity();
                ifAlreadyPresent = true;
            }
        }
        if (!ifAlreadyPresent) {
            list.add(new Item(product, 1, price));
        }
    }

    public int price() {
        int total = 0;
        for (Item price : list) {
            total += price.price();
        }
        return total;
    }
    public void print() {
        for (Item name : list) {
            System.out.println(name);
        }
    }
}
