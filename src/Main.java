import linkedlist.MyLinkedList;
import stackqueue.MyQueue;
import stackqueue.MyStack;

public class Main {
    public static void main(String[] args) {
        MyLinkedList<Integer> myLinkedList = new MyLinkedList<>();

        myLinkedList.add(1);
        myLinkedList.add(2);
        myLinkedList.add(3);
        myLinkedList.add(4);
        myLinkedList.add(5);

        System.out.print("ADD TO MY LINKED LIST: [");
        for (Integer i : myLinkedList) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println("\b\b]");

        System.out.println("GET TO MY LINKED LIST: " + myLinkedList.get(2));
        System.out.println("GET TO MY LINKED LIST: " + myLinkedList.get(0));

        myLinkedList.remove(0);
        myLinkedList.remove(3);

        System.out.print("REMOVE TO MY LINKED LIST: [");
        for (Integer i : myLinkedList) {
            System.out.print(i);
            System.out.print(", ");
        }
        System.out.println("\b\b]");



        System.out.println("\n----------\n");

        MyStack<Integer> stack = new MyStack<>();
        stack.push(15);
        stack.push(18);

        System.out.println("FIRST ELEMENT FROM STACK: " + stack.pop());
        System.out.println("SECOND ELEMENT FROM STACK: " + stack.pop());



        System.out.println("\n----------\n");

        MyQueue<Integer> queue = new MyQueue<>();
        queue.offer(23);
        queue.offer(72);

        System.out.println("FIRST ELEMENT FROM QUEUE: " + queue.poll());
        System.out.println("SECOND ELEMENT FROM QUEUE: " + queue.poll());
    }
}