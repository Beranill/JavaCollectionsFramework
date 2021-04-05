import java.util.LinkedList;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        MyLinkedList myLinkedList = new MyLinkedList();
        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(10);

        System.out.println(myLinkedList.toString());
        System.out.println(myLinkedList.get(2));

        myLinkedList.remove(2);
        System.out.println(myLinkedList.toString());
    }
}
