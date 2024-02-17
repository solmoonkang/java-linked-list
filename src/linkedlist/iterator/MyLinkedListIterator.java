package linkedlist.iterator;

import linkedlist.ListNode;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class MyLinkedListIterator<T> implements Iterator<T> {

    private ListNode<T> currentNode;

    public MyLinkedListIterator(ListNode<T> headNode) {
        this.currentNode = headNode;
    }

    @Override
    public boolean hasNext() {
        return currentNode != null;
    }

    @Override
    public T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }

        T data = currentNode.data;
        currentNode = currentNode.next;
        return data;
    }
}
