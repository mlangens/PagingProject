package PagingProject;

import java.io.IOException;

class PageDriver {
  public static void main(String[] args) throws IOException {
    FileHandler handler = new FileHandler(args[0]);
    handler.processFile();
    for (int i = 0; i < handler.numberOfElements(); i++) {
      
    }
  }
}