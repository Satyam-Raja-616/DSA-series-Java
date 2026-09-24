package basic_maths;

import java.util.Scanner;

public class Factorial {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter no: ");

    int n = in.nextInt();

    long t = 1;

    for (int i = 1; i <= n; i++) {
      t = t * i;
    }

    System.out.println("factorial : " + t);

    in.close();
  }
}