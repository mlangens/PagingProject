package PagingProject;

public class FifoPager extends Pager {

  public FifoPager(int numFrames) {
    super(numFrames);
  }

  @Override
  protected String pagerName() {
    return null;
  }

  @Override
  protected int doPageFault() {
    return 0;
  }

  @Override
  protected void doPageAccess(int frameID) {
  }
}