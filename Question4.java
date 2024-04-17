import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {


    Scanner in = new Scanner(System.in);
    int startWidth = in.nextInt();
    for (int i = 0; i < startWidth; i++) {
      for (int x = 0; x < startWidth - i; x++) {
        System.out.print('*');
      }
      System.out.println();
    }
  }
}