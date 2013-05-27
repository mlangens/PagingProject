package PagingProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map.Entry;

public class PrintBuffer {
  private int mySize;
  private Frame myFrameHistory;
  private int myReferenceString;
  private boolean myWasPageFault;
  private int COLS_PER_LINE;
  private HashMap<Integer, Frame> stateFulFrame = new HashMap<Integer, Frame>();
  
  public PrintBuffer() {
  }

  public void store(Frame frame, int pageID) {
    stateFulFrame.put(pageID, frame);
  }

  public void store(int pageID) {
    
  }

  public void print() {
    for (Entry<Integer, Frame> entry : stateFulFrame.entrySet()) {
      System.out.println(entry.getKey());
      System.out.println("--");
      ArrayList<Integer> pageElements = entry.getValue().getPageElements();
      for (Integer integer : pageElements) {
        System.out.println(integer + "\n");
      }  
    }
  }

  public void printLine(int start, int end) {
  }
}
