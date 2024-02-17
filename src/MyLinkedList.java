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
}
