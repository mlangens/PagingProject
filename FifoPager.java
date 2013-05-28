package PagingProject;

import java.util.Collection;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class FifoPager extends Pager {
  private Queue<Integer> fifo;
  
  public FifoPager(int numFrames) {
    super(numFrames);
    fifo = new ArrayBlockingQueue<Integer>(numFrames);
  }

  private Queue<Integer> fifoQueue = new Queue<Integer>() {
    
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