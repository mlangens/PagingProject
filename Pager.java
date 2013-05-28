package PagingProject;

abstract class Pager {
  protected int myNumFaults;
  protected int myAccesses;
  protected Frame myFrames;
  PrintBuffer myHistory;

  public Pager(int numFrames) {
    setNumFrames(numFrames);
  }

  protected abstract String pagerName();

  protected abstract int doPageFault();

  protected abstract void doPageAccess(int frameID);

  public int setNumFrames(int numFrames) {
    myFrames.setNumFrames(numFrames);
    return myFrames.getNumFrames();
  }

  public int getNumFaults() {
    return myNumFaults;
  }

  public int getAccesses() {
    return myAccesses;
  }
}
