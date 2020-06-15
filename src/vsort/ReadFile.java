package vsort;

import java.util.*;
import java.io.*;

public class ReadFile {
  private String fileName;
  private MyQueue<String> lines;

  public ReadFile(String name) {
    fileName = name;
    lines = new MyQueue<String>(); 
  }

  private void read() throws Exception {
    //System.out.println("Inside read");
    Scanner input = new Scanner(new File(fileName));
    while(input.hasNextLine()) {
      String line = input.nextLine();
      //System.out.println("Adding line");
      //System.out.print(line);
      lines.insert(line);
    }
    input.close();
  }

  public MyQueue<String> getLines() throws Exception {
    //System.out.println("Calling read");
    read();
    return lines;
  }

  /*public static void main(String[] args) throws Exception {
    ReadFile obj = new ReadFile("/home/veera/Projects/Vsort/src/vsort/testFile");
    obj.read();
  }*/
}
  
