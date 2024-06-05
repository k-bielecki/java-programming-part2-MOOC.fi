package validating;

public class Person {

    private String name;
    private int age;

    public Person(String name, int age) {
        if (age < 0 || age > 120) {
            throw new IllegalArgumentException("Illegal age number");
        }
        if (name == null || name.isEmpty() || name.length() > 40) {
            throw new IllegalArgumentException("Name is empty or too long");
        }
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
