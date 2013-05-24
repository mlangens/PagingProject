package PagingProject;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

abstract class Pager {
  protected int myNumFaults;
  protected int myAccesses;
  protected Frames myFrames;
  PrintBuffer myHistory;

  public static void main(String[] args) throws IOException {
    FileHandler handler = new FileHandler();
  }

  public Pager() {

  }

  public Pager(int numFrames) {
    setNumFrames(numFrames);
  }

  protected abstract String pagerName();

  protected abstract int DoPageFault();

  protected abstract void DoPageAccess(int frameID);

  public int setNumFrames(int numFrames) {
    // myFrames.setNumFrames(numFrames);
    // return myFrames.size();
    return 0;
  }

  public int getMyNumFaults() {
    return myNumFaults;
  }

  public int getMyAccesses() {
    return myAccesses;
  }
}

class FileHandler {
  // http://stackoverflow.com/questions/5868369/how-to-read-a-large-text-file-line-by-line-in-java
  
}