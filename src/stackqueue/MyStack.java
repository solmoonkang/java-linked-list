package stackqueue;

import linkedlist.MyLinkedList;

import java.util.NoSuchElementException;

public class MyStack<T> {

    private final MyLinkedList<T> myLinkedList;

    public MyStack() {
        myLinkedList = new MyLinkedList<>();
    }

    public void push(T data) {
        myLinkedList.add(data);
    }

    public T pop() {
        if (isEmpty()) {
            throw new NoSuchElementException();
        }

        T data = myLinkedList.get(myLinkedList.size() - 1);
        myLinkedList.remove(myLinkedList.size() - 1);
        return data;
    }

    private boolean isEmpty() {
        return myLinkedList.size() == 0;
    }
}
