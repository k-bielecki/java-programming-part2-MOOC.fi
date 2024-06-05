import java.util.ArrayList;

public class Herd implements Movable {
    private ArrayList<Movable> list;

    public Herd(){
        this.list = new ArrayList<>();
    }

    public String toString() {
        String value = "";
        for (Movable item : list) {
            value += item.toString() + "\n";
        }
        return value;
    }
    public void addToHerd(Movable movable) {
        list.add(movable);
    }
    @Override
    public void move(int dx, int dy) {
        for (Movable item : list) {
            item.move(dx, dy);
        }

    }
}
