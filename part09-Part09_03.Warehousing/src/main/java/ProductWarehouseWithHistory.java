public class ProductWarehouseWithHistory extends ProductWarehouse{

    private ChangeHistory history;

    public ProductWarehouseWithHistory (String productName, double capacity, double initialBalance) {
        super(productName, capacity);
        this.history = new ChangeHistory();
        this.addToWarehouse(initialBalance);
    }

    public String history() {
        return history.toString();
    }

    @Override
    public void addToWarehouse(double amount) {
        super.addToWarehouse(amount);
        this.history.add(getBalance());
    }

    @Override
    public double takeFromWarehouse(double amount) {

        if (super.getBalance() < amount) {
            this.history.add(super.getBalance());
            return super.getBalance();
        }
        super.takeFromWarehouse(amount);
        this.history.add(super.getBalance());

        return super.getBalance();
    }

    public void printAnalysis() {
        System.out.println("Product: " + this.getName());
        System.out.println("History: " + this.history);
        System.out.println("Largest amount of product: " + history.maxValue());
        System.out.println("Smallest amount of product: " + history.minValue());
        System.out.println("Average: " + history.average());
    }
}
