
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AverageOfSelectedNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // toteuta ohjelmasi tänne
        List<String> listOfNumbers = new ArrayList<>();

        System.out.println("Input numbers, type end to stop.");

        while (true) {
            String input = scanner.nextLine();

            if (input.equals("end")) {
                break;
            }
            listOfNumbers.add(input);
        }

        double averageOfNegatives = listOfNumbers.stream()
                .mapToInt(i -> Integer.valueOf(i))
                .filter(number -> number < 0)
                .average()
                .getAsDouble();

        double averageOfPositives = listOfNumbers.stream()
                .mapToInt(i -> Integer.valueOf(i))
                .filter(number -> number > 0)
                .average()
                .getAsDouble();

        System.out.println("Print the average of the negative numbers or the positive numbers? (n/p)");
        String input = scanner.nextLine();

        if (input.equals("n")) {
            System.out.println("Average of the negative numbers: " + averageOfNegatives);
        }
        if (input.equals("p")) {
            System.out.println("Average of the positive numbers: " + averageOfPositives);
        }

    }
}
