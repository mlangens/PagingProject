package PagingProject;

import java.util.ArrayList;

public class Frame {
  private int numFrames;
  private ArrayList<Integer> pageElements = new ArrayList<Integer>();

  public Frame(int numFrames) {
    initializePageList(numFrames);
    this.numFrames = numFrames;
  }

  public void initializePageList(int numFrames) {
    for (int i = 0; i < numFrames; i++) {
      pageElements.add(0);
    }
  }

  public int getNumFrames() {
    return numFrames;
  }

  public boolean lookupFrameElement(int pageID) {
    return getPageElements().contains(pageID);
  }

  public int getPageAtSlotNumber(int slotNumber) {
    return getPageElements().get(slotNumber);
  }

  public void setNumFrames(int numFrames) {
    this.numFrames = numFrames;
  }

  public ArrayList<Integer> getPageElements() {
    return pageElements;
  }
}
