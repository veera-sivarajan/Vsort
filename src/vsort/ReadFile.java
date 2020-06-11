package vsort;

import java.util.*;
import java.io.*;

public class ReadFile {
  private String fileName;
  
  public ReadFile(String name) {
    fileName = name;
  }

  public void read() throws Exception {
    Scanner input = new Scanner(new File(fileName));
    while(input.hasNextLine()) {
      System.out.println("Line: " + input.nextLine());
    }
    input.close();
  }

  public static void main(String[] args) throws Exception {
    ReadFile obj = new ReadFile("/home/veera/Projects/Vsort/src/vsort/testFile");
    obj.read();
  }
}
  
