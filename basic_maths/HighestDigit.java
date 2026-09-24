package basic_maths;

import java.util.Scanner;

public class HighestDigit {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter no: ");

    int n = in.nextInt();

    int t = 0;
    while (n > 0) {
      int r = n % 10;

      if (r > t) {
        t = r;
      }

      n = n / 10;
    }

    System.out.println("highest digit : " + t);

    in.close();
  }
}
