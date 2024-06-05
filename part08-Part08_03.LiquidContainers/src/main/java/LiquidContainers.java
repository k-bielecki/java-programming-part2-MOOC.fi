
import java.util.Scanner;

public class LiquidContainers {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int first = 0;
        int second = 0;
        int maxVol = 100;

        while (true) {

            System.out.println("First: " + first + "/" + maxVol);
            System.out.println("Second: " + second + "/" + maxVol);

            String input = scan.nextLine();
            if (input.equals("quit")) {
                break;
            }

            String[] parts = input.split(" ");
            String command = parts[0];
            int amount = Integer.valueOf(parts[1]);

            if (command.equals("add") && amount > 0) {
                if (first + amount >= maxVol) {
                    first = maxVol;
                } else {
                    first += amount;
                }
            }

            if (command.equals("move") && amount > 0) {
                if (first - amount >= 0) {
                    first -= amount;
                    second += amount;
                    if (second > maxVol) {
                        second = maxVol;
                    }
                } else {
                    second += first;
                    first = 0;
                    if (second > maxVol) {
                        second = maxVol;
                    }
                }
            }

            if (command.equals("remove") && amount > 0) {
                if (second - amount >= 0) {
                    second -= amount;
                } else {
                    second = 0;
                }
            }
        }
    }

}
