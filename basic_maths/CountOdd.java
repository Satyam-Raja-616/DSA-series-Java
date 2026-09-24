package basic_maths;

import java.util.Scanner;

public class CountOdd {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter no: ");

    int n = in.nextInt();

    int c = 0;
    while (n > 0) {
      int r = n % 10;

      n = n / 10;

      if (r % 2 != 0) {
        c = c + 1;
      }
    }

    System.out.println("no of odd digits: " + c);

    in.close();
  }
}
