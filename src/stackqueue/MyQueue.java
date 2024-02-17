package stackqueue;

import linkedlist.MyLinkedList;

public class MyQueue<T> {

    private final MyLinkedList<T> myLinkedList;

    public MyQueue() {
        myLinkedList = new MyLinkedList<>();
    }

    public void offer(T data) {
        myLinkedList.add(data);
    }
}
