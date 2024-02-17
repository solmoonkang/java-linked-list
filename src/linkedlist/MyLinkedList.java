package linkedlist;

import linkedlist.iterator.MyLinkedListIterator;

import java.util.Iterator;

public class MyLinkedList<T> implements Iterable<T> {

    private ListNode<T> headNode;
    private ListNode<T> tailNode;
    private int size;

    public MyLinkedList() {
        headNode = null;
        tailNode = null;
        size = 0;
    }

    public void add(T data) {
        ListNode<T> lastNode = tailNode;
        ListNode<T> newNode = new ListNode<>(data, null);
        size++;
        tailNode = newNode;

        if (lastNode == null) {
            headNode = newNode;
        } else {
            lastNode.next = newNode;
        }
    }

    public T get(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }
        return search(index).data;
    }

    public void remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            headNode = headNode.next;
            size--;
        } else {
            ListNode<T> prevNode = search(index - 1);
            ListNode<T> removeNode = prevNode.next;

            prevNode.next = removeNode.next;
            removeNode.data = null;
            removeNode.next = null;

            size--;

            if (removeNode == tailNode) {
                tailNode = prevNode;
            }
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new MyLinkedListIterator<T>(headNode);
    }

    public int size() {
        return size;
    }

    private ListNode<T> search(int index) {
        ListNode<T> N = headNode;
        for (int i = 0; i < index; i++) {
            N = N.next;
        }
        return N;
    }
}
