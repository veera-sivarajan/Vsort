package vsort;

public class Queue<T> {
  private Node<T> head;
  private Node<T> tail;

  public Queue() {
    head = tail = null;
  }

  public void insert(T data) {
    Node<T> insertData = new Node<T>(data);
    if (head == null && tail == null) {
      head = tail = insertData;
    } 
    else {
      tail.setLink(insertData);
      tail = insertData;
    }
  }

  public T seek() throws Exception {
    if (head == null && tail == null) {
      throw new Exception("Empty Queue");
    }
    return head.getData();
  }

  public void remove() throws Exception {
    if (head == null && tail == null) {
      throw new Exception("Empty Queue");
    }
    head = head.getLink();
  }
}
