package basic_maths;

import java.util.Scanner;

public class CountDigit {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter no: ");

    int n = in.nextInt();

    int c = 0;
    while (n > 0) {
      n = n / 10;
      c = c + 1;
    }

    System.out.println("len of no: " + c);

    in.close();
  }
}
