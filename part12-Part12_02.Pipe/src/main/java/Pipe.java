import java.util.ArrayList;
import java.util.List;

public class Pipe <T>{
    private List<T> list;

    public Pipe() {
        this.list = new ArrayList<>();
    }

    public void putIntoPipe(T value) {
        list.add(value);
    }

    public T takeFromPipe() {
        T temp = null;
        if (!list.isEmpty()) {
            temp = list.get(0);
            list.remove(0);
        }
        return temp;
    }

    public boolean isInPipe() {
        return !list.isEmpty();
    }
}
