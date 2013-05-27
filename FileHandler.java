package PagingProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

class FileHandler {
  // http://stackoverflow.com/questions/5868369/how-to-read-a-large-text-file-line-by-line-in-java
  private ArrayList<Integer> numFrameList;
  private ArrayList<ArrayList<Integer>> pageSeqList;
  private BufferedReader reader;

  public FileHandler(String fileName) throws FileNotFoundException {
    reader = new BufferedReader(new FileReader(fileName));
    numFrameList = new ArrayList<Integer>();
    pageSeqList = new ArrayList<ArrayList<Integer>>();
  }

  public int getNumFrames(int index) {
    return numFrameList.get(index);
  }

  public ArrayList<Integer> getPageSeq(int index) {
    return pageSeqList.get(index);
  }

  public int numberOfElements() {
    return numFrameList.size();
  }

  public void processFile() throws IOException {
    boolean isFrameCount = true;
    numFrameList.clear();
    pageSeqList.clear();
    ArrayList<Integer> sequence = new ArrayList<Integer>();
    String line = "";
    while ((line = reader.readLine()) != null) {
      Scanner temp = new Scanner(line);
      if (isFrameCount) {
        if (temp.hasNextInt()) {
          isFrameCount = false;
          numFrameList.add(temp.nextInt());
          sequence = new ArrayList<Integer>();
        }
      } else {
        while (temp.hasNextInt()) {
          int tempInt = temp.nextInt();
          if (tempInt == -1) {
            isFrameCount = true;
            pageSeqList.add(sequence);
            break;
          }
          sequence.add(tempInt);
        }
      }
    }
  }
}
