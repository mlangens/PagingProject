package PagingProject;

public class LruPager extends Pager {

  public LruPager(int numFrames) {
    super(numFrames);
  }

  @Override
  protected String pagerName() {
    return null;
  }

  @Override
  protected int DoPageFault() {
    return 0;
  }

  @Override
  protected void DoPageAccess(int frameID) {
  }

}