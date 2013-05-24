package PagingProject;

abstract class Pager {
  protected int myNumFaults;
  protected int myAccesses;
  protected Frames myFrames;
  PrintBuffer myHistory;

  public Pager(int numFrames) {
    setNumFrames(numFrames);
  }

  protected abstract String pagerName();

  protected abstract int DoPageFault();

  protected abstract void DoPageAccess(int frameID);

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
