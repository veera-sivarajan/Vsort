package vsort;

public class Sort {
  private ReadFile reader;
  private Queue<String> lines;

  public Sort(String fileName) {
    reader = new ReadFile(fileName);
  }

  public void method() throws Exception {
    lines = reader.getLines();
    QueueIterator<String> iter = new QueueIterator<String>(lines);
    while(iter.hasNext()) {
      System.out.println(iter.next());
    }
  }

  public static void main(String[] args) throws Exception {
    Sort obj = new Sort("/home/veera/Projects/Vsort/src/vsort/testFile");
    obj.method();
  }
}

