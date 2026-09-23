package patterns;

import java.util.Scanner;

public class Pattern13 {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter no: ");

    int n = in.nextInt();

    int x = 1;

    for (int i = 1; i <= n; i++) {

      for (int j = 1; j <= n; j++) {
        if (j <= i) {
          System.out.print(x);

          x += 1;
        }
      }
      System.out.println();
    }

    in.close();
  }
}
