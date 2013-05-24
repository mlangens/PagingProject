package PagingProject;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;


class PagingDriver {
  // http://stackoverflow.com/questions/5868369/how-to-read-a-large-text-file-line-by-line-in-java
  public void processFile() throws IOException {
    boolean isFrameCount = false; 
    ArrayList<Integer> numFrameList = new ArrayList<Integer>();
    ArrayList<ArrayList<Integer>> pageSeqList = new ArrayList<ArrayList<Integer>>();
    BufferedReader reader = new BufferedReader(new FileReader("scheduleInput.txt"));
    String line = "";
    while ((line = reader.readLine()) != null) {
      Scanner temp = new Scanner(line);
      if(isFrameCount) {
        if(temp.hasNextInt()) {
          numFrameList.add(temp.nextInt());
        }
      }
    }
  }
  
}