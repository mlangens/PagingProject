package PagingProject;

public class LfuPager extends Pager {

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