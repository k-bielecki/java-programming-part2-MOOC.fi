
import java.util.*;

public class MainProgram {

    public static void main(String[] args) {
        userInterface();
    }

    public static void userInterface() {
        Scanner scanner = new Scanner(System.in);
        List<Book> books = new ArrayList<>();

        while (true) {
            System.out.println("Input the name of the book, empty stops:");
            String name = scanner.nextLine();

            if (name.equals("")) {
                break;
            }

            System.out.println("Input the age recommendation:");
            int age = Integer.valueOf(scanner.nextLine());

            books.add(new Book(name, age));

        }

        Comparator<Book> comparator = Comparator
                .comparing(Book::getAgeRecommendation)
                .thenComparing(Book::getName);

        Collections.sort(books, comparator);

        System.out.println(books.size() + " books in total. \n" +
                "\n" +
                "Books:");
        books.stream()
                .forEach(o -> System.out.println(o));
    }

}
