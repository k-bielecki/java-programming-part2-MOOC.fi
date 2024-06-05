public class Container {

    private int volume;

    public Container() {
        this.volume = 0;
    }

    public int contains() {
        return volume;
    }

    public void add (int amount) {
        if (amount >= 0) {
            volume += amount;
            if (volume >= 100) {
                volume = 100;
            }
        }
    }

    public void remove (int amount) {
        if (amount >= 0) {
            volume -= amount;
            if (volume < 0) {
                volume = 0;
            }
        }
    }

    public String toString() {
        return this.contains() + "/100";
    }

}
