package PagingProject;

import java.io.IOException;
import java.util.ArrayList;

class PageDriver {
  public static void main(String[] args) throws IOException {
    FileHandler handler = new FileHandler(args[0]);
    handler.processFile();
    for (int i = 0; i < handler.numberOfElements(); i++) {
      ArrayList<Integer> pageSeq = handler.getPageSeq(i);
      System.out.println(handler.getNumFrames(i) + ": ");
      for (int j = 0; j < pageSeq.size(); j++) {
        System.out.print(pageSeq.get(j)+ " ");
      }
      System.out.println();
    }
  }
}