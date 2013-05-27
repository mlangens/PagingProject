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
    String underscores = buildUnderscoreString();
    buildPageTable();
    for (int i = 0; i < stringBuilder.length; i++) {
      if (i == 1)
        System.out.println(underscores);
      System.out.println(stringBuilder[i]);
    }
  }

  private String buildUnderscoreString() {
    String temp = "";
    for (int i = 0; i < stringBuilder.length; i++) {
      temp += "____";
    }
    return temp;
  }

  private void buildPageTable() {
    String space = "   ";
    for (Entry<Integer, Frame> entry : stateFulFrame.entrySet()) {
      stringBuilder[0] += entry.getKey() + space;
      ArrayList<Integer> pageElements = entry.getValue().getPageElements();
      for (int i = 0; i < pageElements.size(); i++) {
        String temp = stringBuilder[i];
        temp += pageElements.get(i) + space;
        stringBuilder[i + 1] = temp;
      }
    }
  }

  private void initializeStringBuilder() {
    int size = stateFulFrame.size() + 1;
    stringBuilder = new String[size];
    for (int i = 0; i < size; i++) {
      stringBuilder[i] = "";
    }
  }

  public void printLine(int start, int end) {
  }
}
