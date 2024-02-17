public class MyLinkedList<T> {

    private MyListNode<T> headNode;
    private MyListNode<T> tailNode;
    private int size;

    public MyLinkedList() {
        headNode = null;
        tailNode = null;
        size = 0;
    }

    public void add(T data) {
        MyListNode<T> lastNode = tailNode;
        MyListNode<T> newNode = new MyListNode<>(data, null);
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

    public T remove(int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException();
        }

        if (index == 0) {
            T returnData = headNode.data;
            headNode = headNode.next;
            size--;
            return returnData;
        } else {
            MyListNode<T> prevNode = search(index - 1);
            MyListNode<T> removeNode = prevNode.next;
            T returnData = removeNode.data;

            prevNode.next = removeNode.next;
            removeNode.data = null;
            removeNode.next = null;

            size--;

            if (removeNode == tailNode) {
                tailNode = prevNode;
            }

            return returnData;
        }
    }

    public int size() {
        return size;
    }

    private MyListNode<T> search(int index) {
        MyListNode<T> N = headNode;
        for (int i = 0; i < index; i++) {
            N = N.next;
        }
        return N;
    }
}
