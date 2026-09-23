package patterns;

import java.util.Scanner;

public class Pattern12 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter no: ");

    int n = in.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= 2 * n; j++) {
        if ((j <= i && j <= n)) {
          System.out.print(j);
        }

        else if (i + j > 2 * n && j > n) {
          System.out.print(2 * n - j + 1);
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
