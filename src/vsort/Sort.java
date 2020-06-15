package vsort;

public class Sort {
  private ReadFile read;

  public Sort() {
    read = new ReadFile("/home/veera/Projects/Vsort/src/vsort/testFile");
  }
  
  public void method() throws Exception {
    MyQueue<String> lines = read.getLines();
    QueueIterator<String> iter = lines.iterator();
    while(iter.hasNext()) {
      System.out.println(iter.next());
    }
  }

  public static void main(String[] args) throws Exception {
    Sort obj = new Sort();
    obj.method();
  }
}
