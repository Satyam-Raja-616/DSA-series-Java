package patterns;

import java.util.Scanner;

public class Pattern22 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter no: ");
        int n = in.nextInt();

        for (int i = 1; i <= (2 * n - 1); i++) {
            for (int j = 1; j <= (2 * n - 1); j++) {
                // Distances to the 4 edges (1-indexed)
                int top = i - 1;
                int left = j - 1;
                int bottom = (2 * n - 1) - i;
                int right = (2 * n - 1) - j;

                int minDist = Math.min(Math.min(top, bottom), Math.min(left, right));

                System.out.print((n - minDist) + " ");
            }
            System.out.println();
        }

        in.close();
    }
}