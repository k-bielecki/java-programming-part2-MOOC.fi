import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Employees {

    private List<Person> personList;

    public Employees(){
        this.personList = new ArrayList<>();
    }
    public void add (Person personToAdd) {
        personList.add(personToAdd);
    }
    public void add (List<Person> peopleToAdd) {
        personList.addAll(peopleToAdd);
    }

    public void print(){
        Iterator<Person> iterator = personList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next().toString());
        }
    }
    public void print (Education education){
        Iterator<Person> iterator = personList.iterator();

        while (iterator.hasNext()){
            Person person = iterator.next();
            if (person.getEducation().equals(education)){
                System.out.println(person);
            }
        }
    }

    public void fire (Education education) {
        Iterator<Person> iterator = personList.iterator();

        while (iterator.hasNext()){
            if (iterator.next().getEducation().equals(education)){
                iterator.remove();
            }
        }
    }


}
