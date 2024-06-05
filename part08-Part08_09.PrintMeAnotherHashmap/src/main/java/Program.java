
import java.util.HashMap;

public class Program {

    public static void main(String[] args) {
        // Test your program here!
        HashMap<String, Book> hashmap = new HashMap<>();
        hashmap.put("sense", new Book("Sense and Sensibility", 1811, "..."));
        hashmap.put("prejudice", new Book("Pride and prejudice", 1813, "...."));

        printValues(hashmap);
        System.out.println("---");
        printValueIfNameContains(hashmap, "prejud");
    }

    public static void printValues(HashMap<String, Book> hashmap) {
        for (Book key : hashmap.values()) {
            System.out.println(key);
        }
    }

    public static void printValueIfNameContains(HashMap<String, Book> hashmap, String text) {
        for (Book key : hashmap.values()) {
            if (key.getName().contains(text)) {
                System.out.println(key);
            }
        }

    }

}
