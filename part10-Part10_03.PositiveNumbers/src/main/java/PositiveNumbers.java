
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PositiveNumbers {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // test your method here
        List<Integer> inputs = new ArrayList<>();

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("end")) {
                break;
            }
            inputs.add(Integer.valueOf(userInput));
        }

        System.out.println(positive(inputs));



    }

    public static List<Integer> positive(List<Integer> numbers) {
        ArrayList<Integer> positiveNumbers = numbers.stream()
                .filter(i -> i > 0)
                .collect(Collectors.toCollection(ArrayList::new));
        return positiveNumbers;



    }

}
