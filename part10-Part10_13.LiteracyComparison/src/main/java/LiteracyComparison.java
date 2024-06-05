
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class LiteracyComparison {
    
    public static void main(String[] args) {
        readFile();

    }

    public static void readFile() {
        List<Literacy> rows = new ArrayList<>();

        try {
            Files.lines(Paths.get("literacy.csv"))
                    .map (row -> row.split(","))
                    .map (parts -> new Literacy(parts[3], Integer.valueOf(parts[4]), parts[2].replace("(%)", "").trim(), Double.valueOf(parts[5])) )
                    .forEach(row -> rows.add(row));
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        rows.stream()
                .sorted()
                .forEach(o-> System.out.println(o));
    }
}
