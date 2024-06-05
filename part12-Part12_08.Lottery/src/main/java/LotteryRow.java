
import java.util.ArrayList;
import java.util.Random;

public class LotteryRow {

    private ArrayList<Integer> numbers;

    public LotteryRow() {
        // Draw the numbers when the LotteryRow is created
        this.randomizeNumbers();
    }

    public ArrayList<Integer> numbers() {
        return this.numbers;
    }

    public void randomizeNumbers() {
        // Initialize the list for numbers
        this.numbers = new ArrayList<>();
        Random random = new Random();
        for (int i = 0; i <= 6; i++) {
            int number = random.nextInt(40) + 1;
            if (containsNumber(number)) {
                i -= 1;
                continue;
            }
            this.numbers.add(number);
            // Implement the random number generation here
            // the method containsNumber is probably useful
        }
    }

    public boolean containsNumber(int number) {
        // Check here whether the number is among the drawn numbers
        return numbers.contains(number);
    }
}

