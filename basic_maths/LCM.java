package basic_maths;

import java.util.Scanner;

public class LCM {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter 1st no: ");

    int n1 = in.nextInt();

    System.out.print("Enter 2nd no: ");

    int n2 = in.nextInt();

    if (n1 < n2) {
      int t = n2;
      while (t <= n1 * n2) {
        if (t % n1 == 0 && t % n2 == 0) {
          System.out.println("LCM of " + n1 + " & " + n2 + " : " + t);
          break;
        }

        t++;
      }
    }

    else if (n2 < n1) {
      int t = n1;
      while (t <= n1 * n2) {
        if (t % n1 == 0 && t % n2 == 0) {
          System.out.println("lcm of " + n1 + " & " + n2 + " : " + t);
          break;
        }

        t++;
      }
    }

    else {
      System.out.println("both no r same");
    }

    in.close();

  }
}
