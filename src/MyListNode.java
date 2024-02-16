public class MyListNode<T> {

    private T data;
    private MyListNode<T> next;

    public MyListNode(T data,
                      MyListNode<T> next) {
        this.data = data;
        this.next = next;
    }
}
