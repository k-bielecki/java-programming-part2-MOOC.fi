import java.util.ArrayList;

public class Box implements Packable {
    private double maxCapacity;
    private ArrayList<Packable> content;

    public Box (double maxCapacity) {
        this.maxCapacity = maxCapacity;
        this.content = new ArrayList<>();
    }

    public void add (Packable item) {
        if (weight() + item.weight() <= maxCapacity) {
            content.add(item);
        }
    }
    @Override
    public double weight() {
        double weight = 0;
        for (Packable item : content) {
            weight += item.weight();
        }
        return weight;
    }

    public String toString() {
        return "Box: " + content.size() + " items, total weight " + weight() + " kg";
    }
}
