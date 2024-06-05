import java.util.ArrayList;

public class ChangeHistory {

    private ArrayList<Double> historyList;

    public ChangeHistory() {
        this.historyList = new ArrayList<>();
    }

    public double maxValue() {
        if (historyList.isEmpty()) {
            return 0;
        }
        double maxValue = historyList.get(0);
        for (Double max : historyList) {
            if (max > maxValue) {
                maxValue = max;
            }
        }
        return maxValue;
    }

    public double minValue() {
        if (historyList.isEmpty()) {
            return 0;
        }
        double minValue = historyList.get(0);
        for (Double min : historyList) {
            if (min < minValue) {
                minValue = min;
            }
        }
        return minValue;
    }

    public double average() {
        if (historyList.isEmpty()) {
            return 0;
        }
        double sumOfNumbers = 0;
        for (Double number : historyList) {
            sumOfNumbers += number;
        }
        return sumOfNumbers/historyList.size();
    }

    public void add(double status) {
        this.historyList.add(status);
    }
    public void clear() {
        this.historyList.clear();
    }
    public String toString() {
        return historyList.toString();
    }
}
