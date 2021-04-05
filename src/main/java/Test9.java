import java.util.*;

public class Test9 {
    public static void main(String[] args) {
        List<Person3> peopleList = new ArrayList<>();
        Set<Person3> peopleSet = new TreeSet<>();

        addElements(peopleList);
        addElements(peopleSet);

        Collections.sort(peopleList);

        System.out.println(peopleList);
        System.out.println(peopleSet);
    }

    private static void addElements(Collection collection) {
        collection.add(new Person3(4, "George"));
        collection.add(new Person3(1, "Bob"));
        collection.add(new Person3(3, "Katy"));
        collection.add(new Person3(2, "To"));
    }
}

class Person3 implements Comparable<Person3>{
    private int id;
    private String name;

    public Person3(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Person3{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person3 person3 = (Person3) o;
        return id == person3.id &&
                Objects.equals(name, person3.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public int compareTo(Person3 o) {
        if (this.name.length() > o.getName().length()){
            return 1;
        }else if (this.name.length() < o.getName().length()){
            return -1;
        }else {
            return 0;
        }
    }
}
