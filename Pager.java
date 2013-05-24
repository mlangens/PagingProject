package PagingProject;

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
  
  private void setNumFrames(int numFrames) {

  }

  public int getMyNumFaults() {
    return myNumFaults;
  }

  public int getMyAccesses() {
    return myAccesses;
  }    
}