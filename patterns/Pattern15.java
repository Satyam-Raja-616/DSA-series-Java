package patterns;

import java.util.Scanner;

public class Pattern15 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter no: ");

    int n = in.nextInt();

    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= n; j++) {
        if (i <= j) {
          System.out.print((char) ('A' + j - i));
        }
      }
      System.out.println();
    }

    in.close();
  }
}
