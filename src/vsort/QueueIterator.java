package vsort;

import java.util.Iterator;

public class QueueIterator<T> implements Iterator<T> {
  private Node<T> curr;

  public QueueIterator(Queue<T> list) {
    curr = list.getHead();
  }

  public boolean hasNext() {
    return curr != null;
  }
  
  public T next() {
    T data = curr.getData();
    curr = curr.getLink();
    return data;
  }
}

  
