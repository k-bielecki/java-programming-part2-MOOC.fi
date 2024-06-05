
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class LimitedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Integer> integers = new ArrayList<>();

        while (true) {
            int userInput = Integer.valueOf(scanner.nextLine());

            if (userInput < 0) {
                break;
            }

            integers.add(userInput);
        }

        integers.stream()
                .filter(i -> i >= 1 && i <= 5)
                .forEach(i -> System.out.println(i));

    }
}
