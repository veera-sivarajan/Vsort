package vsort;

public class Node<T> {
  private T data;
  private Node<T> link;

  public Node(T data, Node<T> link) {
    this.data = data;
    this.link = link;
  }

  public Node(T data) {
    this(data, null);
  }

  public void setLink(Node<T> link) {
    this.link = link;
  }

  public void setData(T data) {
    this.data = data;
  }

  public T getData() {
    return data;
  }

  public Node<T> getLink() {
    return link;
  }
}
