
import java.util.ArrayList;
import java.util.Scanner;

public class PrintingUserInput {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> userString = new ArrayList<>();

        while (true) {
            String userInput = scanner.nextLine();

            if (userInput.equals("")) {
                break;
            }
            userString.add(userInput);
        }
        userString.stream()
                .forEach(i -> System.out.println(i));
    }
}
