package linkedlist.iterator;

import linkedlist.ListNode;

import java.util.Iterator;
import java.util.NoSuchElementException;

public class ListIterator<T> implements Iterator<T> {

    private ListNode<T> currentNode;

    public ListIterator(ListNode<T> headNode) {
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
