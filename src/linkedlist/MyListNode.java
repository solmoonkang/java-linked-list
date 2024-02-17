package linkedlist;

public class MyListNode<T> {

    public T data;
    public MyListNode<T> next;

    public MyListNode(T data,
                      MyListNode<T> next) {
        this.data = data;
        this.next = next;
    }
}
