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
    for (int i = 0; i < stateFulFrame.size(); i++) {
      stringBuilder[i] = "";
    }
  }

  public void printLine(int start, int end) {
  }
}
