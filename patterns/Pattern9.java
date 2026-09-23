package patterns;

import java.util.Scanner;

public class Pattern9 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter no: ");

    int n = in.nextInt();
    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= (2 * n - 1); j++) {
        if (i + j > n && j <= n + i - 1) {
          System.out.print("*");
        }

        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    for (int i = n + 1; i <= 2 * n; i++) {
      for (int j = 1; j <= (2 * n - 1); j++) {
        if (i + j <= 3 * n && j >= i - n) {
          System.out.print("*");
        }

        else {
          System.out.print(" ");
        }
      }
      System.out.println();
    }

    in.close();
  }
}
