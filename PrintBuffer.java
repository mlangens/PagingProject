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
    for (int i = 0; i < pageIDs.size(); i++) {
      System.out.print(" " + pageIDs.get(i) + " ");
    }
    System.out.print("\n");
    for (int i = 0; i < pageIDs.size(); i++) {
      System.out.print("___");
    }
    System.out.print("\n");
    for (int i = 0; i < frames.size(); i++) {
      for (int j = 0; j < frames.size(); ++j) {
        if (frames.get(j) == null) {
          System.out.print("   ");
        } else {
          System.out.print(" " + frames.get(j).getPageAtSlotNumber(i) + " ");
        }
      }
      System.out.print("\n");
    }
  }

  public void printLine(int start, int end) {
  }
}
