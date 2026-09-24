package basic_maths;

import java.util.Scanner;

public class GCD {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter 1st no: ");

    int n1 = in.nextInt();

    System.out.print("Enter 2nd no: ");

    int n2 = in.nextInt();

    if (n1 < n2) {
      int t = 1;
      for (int i = 2; i <= n1; i++) {
        if (n1 % i == 0 && n2 % i == 0) {
          t = i;
        }
      }

      System.out.println("GCD of " + n1 + " & " + n2 + " : " + t);
    }

    else if (n2 < n1) {
      int t = 1;
      for (int i = 2; i <= n2; i++) {
        if (n2 % i == 0 && n1 % i == 0) {
          t = i;
        }
      }

      System.out.println("gcd of " + n1 + " & " + n2 + " : " + t);
    }

    else {
      System.out.println("both no r same");
    }

    in.close();

  }
}
