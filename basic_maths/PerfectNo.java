package basic_maths;

import java.util.Scanner;

public class PerfectNo {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter no: ");

    int n = in.nextInt();

    int t = 0;
    for (int i = 1; i < n; i++) {
      if (n % i == 0) {
        t = t + i;
      }
    }

    System.out.println("sum of digits: " + t);

    if (t == n) {
      System.out.println(n + " is perfect");
    }

    else {
      System.out.println(n + " is not perfect");
    }

    in.close();
  }
}
