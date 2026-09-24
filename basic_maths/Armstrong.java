package basic_maths;

import java.util.Scanner;

public class Armstrong {
  public static void main(String[] args) {
    Scanner in = new Scanner(System.in);

    System.out.print("Enter no: ");

    int n = in.nextInt();
    int x = n;
    int y = x;

    int c = 0;
    while (n > 0) {
      n = n / 10;

      c = c+1;
    }

    int t = 0;
    while (x > 0) {
      int r = x%10;
      
      t = t + (int) Math.pow(r, c);

      x = x/10;
    }

    if (y == t) {
      System.out.println(y + " is armstrong");
    }

    else {
      System.out.println(y + " is not armstrong");
    }

    in.close();
}
}
