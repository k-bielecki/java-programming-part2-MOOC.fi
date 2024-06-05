
import java.util.ArrayList;

public class Suitcase {

    private int maximumWeight;
    private ArrayList<Item> items;

    public Suitcase(int maximumWeight) {
        this.items = new ArrayList<>();
        this.maximumWeight = maximumWeight;
    }

    public void addItem(Item Item) {
        if (this.totalWeight() + Item.getWeight() > this.maximumWeight) {
            return;
        }

        this.items.add(Item);
    }

    public int totalWeight() {
        //int summa = 0;
        //int indeksi = 0;

        return items.stream()
                .mapToInt(i -> i.getWeight())
                .reduce(0, (sum, value) -> sum + value);

        //return weight;

        //while (indeksi < this.Items.size()) {
            //summa += this.Items.get(indeksi).getWeight();
            //indeksi++;

        //return summa;
    }

    public void printItems() {
        //int indeksi = 0;

        //while (indeksi < this.Items.size()) {
            //Item t = this.Items.get(indeksi);
            //System.out.println(t);
            //indeksi++;
        //}

        items.stream()
                .map(i -> i.toString())
                .forEach(y -> System.out.println(y));
    }

    public Item heaviestItem() {
        if (this.items.isEmpty()) {
            return null;
        }

        // Tutustumme järjestämiseen hieman myöhemmin kurssilla
        return this.items.stream().max((t1, t2) -> t1.getWeight() - t2.getWeight()).get();
    }

    @Override
    public String toString() {
        if (this.items.isEmpty()) {
            return "no items (0 kg)";
        }

        if (this.items.size() == 1) {
            return "1 item (" + this.totalWeight() + " kg)";
        }

        return this.items.size() + " items (" + this.totalWeight() + " kg)";
    }
}
