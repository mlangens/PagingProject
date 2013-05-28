package PagingProject;

import java.io.IOException;
import java.util.ArrayList;

class PageDriver {
  public static void main(String[] args) throws IOException {
    FileHandler fileHandler = new FileHandler(args[0]);
    fileHandler.processFile();
    for (int i = 0; i < fileHandler.numberOfElements(); i++) {
      ArrayList<Integer> pageSeq = fileHandler.getPageSeq(i);
      System.out.println(fileHandler.getNumFrames(i) + ": ");
      for (int j = 0; j < pageSeq.size(); j++) {
        System.out.print(pageSeq.get(j) + " ");
      }
      System.out.println();
    }

    PrintBuffer buffer = new PrintBuffer();
    for (int i = 0; i < 10; i++) {
      Frame temp = new Frame(4);
      buffer.store(temp, i);
    }
    buffer.print();
  }
}