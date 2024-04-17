import java.util.Scanner;
import java.util.*;

public class Question5 {
  public static void main(String[] args) {

    
    Scanner in = new Scanner(System.in);
    int noofNos = in.nextInt();
    List<Integer> intList = new ArrayList<Integer>();

    for (int i = 0; i < noofNos; i++) {
      int inputNo = in.nextInt();
      intList.add(inputNo);
    }
    int highest = 0;
    int mode = 0;
    for (int number : intList) {
      int count = Collections.frequency(intList, number);
      if (count > highest) {
        highest = count;
        mode = number;
      }
    }
    System.out.println(mode);
  }
}