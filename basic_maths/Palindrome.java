package basic_maths;

import java.util.Scanner;

public class Palindrome {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter no: ");

    int n = in.nextInt();

    int x = n;

    int t = 0;
    while (n > 0) {
      int r = n % 10;

      t = t * 10 + r;

      n = n / 10;
    }

    System.out.println("reverse : " + t);

    if (x == t) {
      System.out.println(x + " is palindrome");
    }

    else {
      System.out.println(x + " is not palindrome");
    }

    in.close();
  }
}
