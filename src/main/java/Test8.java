import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Test8 {
    public static void main(String[] args) {
        List<Person2> people = new ArrayList<>();

        people.add(new Person2(2, "Katy"));
        people.add(new Person2(3, "Mike"));
        people.add(new Person2(1, "Bob"));

        Collections.sort(people, new Comparator<Person2>() {
            @Override
            public int compare(Person2 o1, Person2 o2) {
                if (o1.getId() > o2.getId()){
                    return 1;
                } else if (o1.getId() < o2.getId()){
                    return -1;
                } else {
                    return 0;
                }
            }
        });

        System.out.println(people);
    }
}

class Person2{
    private int id;
    private String name;

    public Person2(int id, String name) {
        this.id = id;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person2{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    public int getId() {
        return id;
    }
}
