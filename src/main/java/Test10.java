import java.util.LinkedList;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class Test10 {
    public static void main(String[] args) {
        Person4 person1 = new Person4(1);
        Person4 person2 = new Person4(2);
        Person4 person3 = new Person4(3);
        Person4 person4 = new Person4(4);

        Queue<Person4> people = new ArrayBlockingQueue<Person4>(3);

        System.out.println(people.offer(person3));
        System.out.println(people.offer(person2));
        System.out.println(people.offer(person4));
        System.out.println(people.offer(person1));
    }
}

class Person4{
    private int id;

    public Person4(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Person4{" +
                "id=" + id +
                '}';
    }
}
