package vsort;

import java.util.*;

public class Sort {
  private ReadFile read;
  private ArrayList<String> result;

  public Sort() {
    read = new ReadFile("/home/veera/Projects/Vsort/src/vsort/testFile");
    result = new ArrayList<String>();
  }
  
  /*public void method() throws Exception {
    MyQueue<String> lines = read.getLines();
    QueueIterator<String> iter = lines.iterator();
    while(iter.hasNext()) {
      System.out.println(iter.next());
    }
  }*/
    
  public void stupidSort() throws Exception {
    MyQueue<String> lines = read.getLines();
    QueueIterator<String> iter = lines.iterator();
    while(lines.getSize() > 0) {
      System.out.println("Entering Loop");
      String str = lines.remove();
      result.add(str);
      System.out.println("Adding: " + str);
    }
    System.out.println(result);
    Collections.sort(result);
    System.out.println(result);
  }

  public static void main(String[] args) throws Exception {
    Sort obj = new Sort();
    obj.stupidSort();
  }
}
