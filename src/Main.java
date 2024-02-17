import linkedlist.MyLinkedList;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);

        myLinkedList.remove(0);

        System.out.print("ADD TO MY LINKED LIST: [");
        for (int i = 0; i < myLinkedList.size(); i++) {
            System.out.print(myLinkedList.get(i));
            if (i < myLinkedList.size() - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}