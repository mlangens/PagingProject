package PagingProject;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class FifoPager extends Pager {
  private Queue<Integer> fifo;

  public FifoPager(int numFrames) {
    super(numFrames);
    fifo = new ArrayBlockingQueue<Integer>(numFrames);
    for (int i = 0; i < numFrames; i++)
      fifo.add(i);
  }

  @Override
  protected String pagerName() {
    return null;
  }

  @Override
  protected int doPageFault() {
    int index = fifo.remove();
    fifo.add(index);
    return index;
  }

  @Override
  protected void doPageAccess(int frameID) {
  }
}