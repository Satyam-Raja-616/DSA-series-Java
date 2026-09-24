package basic_maths;

import java.util.Scanner;

public class CountPrime {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter no: ");

    int n = in.nextInt();

    int c = 0;
    if (n <= 1) {
      System.out.println(n + " is neither prime nor composite");
    }

    else {

      for (int i = 2; i <= n; i++) {
        boolean isPrime = true;

        for (int j = 2; j * j <= i; j++) {
          if (i % j == 0) {
            isPrime = false;
            break;
          }
        }

        if (isPrime) {
          c += 1;
        }
      }

      in.close();
    }
    System.out.println("no. of prime: " + c);

    in.close();
  }
}
