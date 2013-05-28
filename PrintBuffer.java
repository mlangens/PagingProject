package PagingProject;

import java.util.ArrayList;

public class PrintBuffer {
  private int mySize;
  private Frame myFrameHistory;
  private int myReferenceString;
  private boolean myWasPageFault;
  private int COLS_PER_LINE;
  private String[] stringBuilder;
  ArrayList<Integer> pageIDs = new ArrayList<Integer>();
  ArrayList<Frame> frames = new ArrayList<Frame>();

  public void store(Frame frame, int pageID) {
    pageIDs.add(pageID);
    frames.add(frame);
  }

  public void store(int pageID) {
    pageIDs.add(pageID);
    frames.add(null);
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
    for (int i = 0; i < pageIDs.size(); i++) {
      stringBuilder[0] += i + space;
      printPageElements(space, frames.get(i).getPageElements());
    }
  }

  private void printPageElements(String space, ArrayList<Integer> pageElements) {
    for (int i = 0; i < pageElements.size(); i++) {
      String temp = stringBuilder[i + 1];
      temp += pageElements.get(i) + space;
      stringBuilder[i + 1] = temp;
    }
  }

  private void initializeStringBuilder() {
    int size = pageIDs.size() + 1;
    stringBuilder = new String[size];
    for (int i = 0; i < size; i++) {
      stringBuilder[i] = "";
    }
  }

  public void printLine(int start, int end) {
  }
}
