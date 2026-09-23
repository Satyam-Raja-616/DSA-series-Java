package patterns;

import java.util.Scanner;

public class Pattern20 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter no: ");

    int n = in.nextInt();

    for (int i = 1; i <= (2 * n - 1); i++) {
      for (int j = 1; j <= 2 * n; j++) {
        if ((j <= i && i <= n)) {
          System.out.print("*");
        }

        else if (i + j > 2 * n && j > n && i <= n) {
          System.out.print("*");
        }

        else if (i > n && j <= (2 * n - i)) {
          System.out.print("*");
        }

        else if (j > i && i > n) {
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
