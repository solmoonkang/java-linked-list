package stackqueue;

import linkedlist.MyLinkedList;

import java.util.NoSuchElementException;

public class MyQueue<T> {

    private final MyLinkedList<T> myLinkedList;

    public MyQueue() {
        myLinkedList = new MyLinkedList<>();
    }

    public void offer(T data) {
        myLinkedList.add(data);
    }

    public T poll() {
        if (myLinkedList.isEmpty()) {
            throw new NoSuchElementException();
        }

        T returnData = myLinkedList.get(0);
        myLinkedList.remove(0);
        return returnData;
    }
}
