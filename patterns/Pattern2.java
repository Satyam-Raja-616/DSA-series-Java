package patterns;

import java.util.Scanner;

public class Pattern2 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter no: ");

    int n = in.nextInt();

    for (int i = 1; i <= n; i++) {
      for (int j = 1; j <= n; j++) {
        if (j <= i) {
          System.out.print("*");
        }
      }
      System.out.println();
    }

    in.close();
  }
}
