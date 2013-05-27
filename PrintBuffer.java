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
  private String[] stringBuilder;

  public PrintBuffer() {
  }

  public void store(Frame frame, int pageID) {
    stateFulFrame.put(pageID, frame);
  }

  public void store(int pageID) {

  }

  public void print() {
    initializeStringBuilder();
    // buildPageTable();
    for (int i = 0; i < stringBuilder.length; i++) {
      if (i == 1)
        System.out.println("______________________________________________");
      System.out.println(stringBuilder[i]);
    }
  }

  private void buildPageTable() {
    for (Entry<Integer, Frame> entry : stateFulFrame.entrySet()) {
      // stringBuilder.add(Integer.toString(entry.getKey()));
      ArrayList<Integer> pageElements = entry.getValue().getPageElements();
      for (int i = 0; i < pageElements.size(); i++) {
        String temp = stringBuilder[i + 1];
        temp += pageElements.get(i) + "  ";
        stringBuilder[i + 1] = temp;
      }
    }
  }

  private void initializeStringBuilder() {
    for (int i = 0; i < stateFulFrame.size() + 1; i++) {
      System.out.println(stateFulFrame.size());
      // stringBuilder[i] = "";
    }
  }

  public void printLine(int start, int end) {
  }
}
