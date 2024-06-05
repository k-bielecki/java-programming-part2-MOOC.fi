public class Literacy implements Comparable<Literacy> {

    private String country;
    private int year;
    private String gender;
    private double percentage;

    public Literacy(String country, int year, String gender, double percentage) {
        this.country = country;
        this.year = year;
        this.gender = gender;
        this.percentage = percentage;
    }

    public double getPercentage(){
        return percentage;
    }

    @Override
    public String toString() {
        return this.country + " (" + this.year + "), " + this.gender + ", " + this.percentage;
    }

    @Override
    public int compareTo(Literacy o) {

        if (this.getPercentage() > o.getPercentage()) {
            return 1;
        }
        if (this.getPercentage() < o.getPercentage()) {
            return -1;
        }
        return 0;
    }
}
