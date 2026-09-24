package basic_maths;

import java.util.Scanner;

public class Divisors {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter no: ");

    int n = in.nextInt();
    
    System.out.print("divisors of " + n + " : ");

    int i = 1;
    while (i <= n) {
      if (n % i == 0) {
        System.out.print(i);

        if (i != n) {
          System.out.print(" , ");
        }
      }
      i++;
    }

    in.close();

  }
}
