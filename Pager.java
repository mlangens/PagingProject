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

  public Pager() {

  }

  public Pager(int numFrames) {
    setNumFrames(numFrames);
  }

  protected abstract String pagerName(); 
  
  protected abstract int DoPageFault();
  
  protected abstract void DoPageAccess(int frameID);
  
//  public int setNumFrames(int numFrames) {
//    myFrames.setNumFrames(numFrames);
//    return myFrames.size();
//  }

  public int getMyNumFaults() {
    return myNumFaults;
  }

  public int getMyAccesses() {
    return myAccesses;
  }    
}

class FileHandler {
  //http://stackoverflow.com/questions/5868369/how-to-read-a-large-text-file-line-by-line-in-java
  public HashMap<Integer, ArrayList<Integer>> handleFile() throws IOException {
    HashMap<Integer, ArrayList<Integer>> frameNumVsTriesMap = new HashMap<Integer, ArrayList<Integer>>();     
    BufferedReader reader = new BufferedReader(new FileReader("pages.dat"));
    String line = "";
    while ((line = reader.readLine()) != null) {
    }
    reader.close();
    return frameNumVsTriesMap;
  }
}