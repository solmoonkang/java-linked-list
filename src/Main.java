import linkedlist.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);

        myLinkedList.remove(3);

        System.out.print("MY LINKED LIST: [");
        for (Integer i : myLinkedList) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println("\b\b]");
    }
}