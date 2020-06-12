package vsort;

import java.util.ArrayList;

public class Sort {
  private ReadFile reader;
  private ArrayList<String> lines;

  public Sort(String fileName) {
    reader = new ReadFile(fileName);
  }

  public ArrayList<String> getLines() {
    return lines;
  }

  /*public void method() throws Exception {
    lines = reader.getLines();
    QueueIterator<String> iter = new QueueIterator<String>(lines);
    while(iter.hasNext()) {
      System.out.println(iter.next());
    }
  }*/
  public void mergeSort() throws Exception {
    System.out.println("Inside mergeSort()");
    lines = reader.getLines();
    int sizeOfLines = lines.size();
    System.out.println("size: " + sizeOfLines);
    ArrayList<String> temp = new ArrayList<String>(sizeOfLines);
    System.out.println(sizeOfLines);
    mergeSortHelper(lines, temp, 0, sizeOfLines - 1);
  }

  private void mergeSortHelper(ArrayList<String> lines, ArrayList<String> temp, int low, int high) {
    System.out.println("Inside mergeSortHelper");
    if(low >= high) {
      return;
    }
    int mid = (low + high) / 2;
    System.out.println("Mid: " + mid);
    mergeSortHelper(lines, temp, low, mid);
    mergeSortHelper(lines, temp, mid + 1, high);
    merge(lines, temp, low, mid + 1, high);
  }

  private void merge(ArrayList<String> lines, ArrayList<String> temp, int low, int mid, int high) {
    System.out.println("Inside merge");
    int li = low, ri = mid, ti = low;
    System.out.println("Li: " + li + "ri: " + ri + "ti: " + ti + "hi: " + high);
    System.out.println("mid: " + mid);
    while((li < mid) && (ri <= high)) {
      if(lines.get(li).compareTo(lines.get(ri)) < 0) {
        temp.set(ti++, lines.get(li++));
      }
      else {
        temp.set(ti++, lines.get(ri++));
      }
    }
    while(li < mid) {
      temp.set(ti++, lines.get(li++));
    }
    while(ri <= high) {
      temp.set(ti++, lines.get(ri++));
    }
    for(int i = low; i <= high; ++i) {
      lines.set(i, temp.get(i));
    }
  }

  public static void main(String[] args) throws Exception {
    Sort obj = new Sort("/home/veera/Projects/Vsort/src/vsort/testFile");
    obj.mergeSort();
    for(String ele : obj.getLines()) {
      System.out.println(ele);
    }
  }
}

