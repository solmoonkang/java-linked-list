package stackqueue;

import linkedlist.MyLinkedList;

public class MyStack<T> {

    private MyLinkedList<T> myLinkedList;

    public MyStack() {
        myLinkedList = new MyLinkedList<>();
    }

    public void push(T data) {
        myLinkedList.add(data);
    }
}
