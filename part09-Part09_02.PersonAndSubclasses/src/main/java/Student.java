public class Student extends Person{

    private int study;

    public Student(String name, String address) {
        super (name, address);
    }

    public void study() {
        this.study++;
    }

    public int credits() {
        return study;
    }

    @Override
    public String toString() {
        return super.toString() + "\n  Study credits " + study;
    }
}
