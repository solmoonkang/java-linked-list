public class MyLinkedList<T> {

    private MyListNode<T> headNode;
    private MyListNode<T> tailNode;
    private int size;

    public MyLinkedList() {
        headNode = null;
        tailNode = null;
        size = 0;
    }

    public void addFirst(T value) {
        MyListNode<T> firstNode = headNode;
        MyListNode<T> newNode = new MyListNode<>(value, firstNode);

        size++;

        headNode = newNode;

        if (firstNode == null) {
            tailNode = newNode;
        }
    }
}
