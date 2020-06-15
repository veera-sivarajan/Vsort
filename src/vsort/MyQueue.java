package vsort;

public class MyQueue<T> {
  private Node<T> head;
  private Node<T> tail;
  private int size;

  public MyQueue() {
    head = tail = null;
    size = 0;
  }

  public Node<T> getHead() {
    return head;
  }

  public int getSize() {
    return size;
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
    size += 1;
  }

  public T seek() throws Exception {
    if (head == null && tail == null) {
      throw new Exception("Empty Queue");
    }
    return head.getData();
  }

  public T remove() throws Exception {
    if (head == null && tail == null) {
      throw new Exception("Empty Queue");
    }
    T data = head.getData();
    head = head.getLink();
    size -= 1;
    return data;
  }

  public QueueIterator<T> iterator() {
    return new QueueIterator<T>(this);
  }

  public T getEleAt(int index) {
    int i = 0;
    Node<T> ptr = head;
    while(i < index) {
      ptr = ptr.getLink();
      i += 1;
    }
    return ptr.getData();
  }

  public void setEleAt(int index, T data) {
    int i = 0;
    Node<T> ptr = head;
    while(i < index) {
      ptr = ptr.getLink();
      i += 1;
    }
    ptr.setData(data);
  }

     
}

