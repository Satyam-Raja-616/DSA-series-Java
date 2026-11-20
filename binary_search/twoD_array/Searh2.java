package binary_search.twoD_array;

import java.util.Arrays;

public class Searh2 {

  public static void main(String[] args) {
    int[][] mat = {
        { 1, 4, 7, 11, 15 },
        { 2, 5, 8, 12, 19 },
        { 3, 6, 9, 16, 22 },
        { 10, 13, 14, 17, 24 },
        { 18, 21, 23, 26, 30 }
    };

    System.out.println(Arrays.toString(srch(mat, 17)));
  }

  static int[] srch(int[][] mat, int tar) {

    if (mat.length == 0 || mat[0].length == 0) {
      return new int[] { -1, -1 };
    }

    int r = 0;
    int c = mat[0].length - 1;

    while (r < mat.length && c >= 0) {
      if (mat[r][c] == tar) {
        return new int[] { r, c };
      }

      if (mat[r][c] > tar) {
        r++;
      }

      else {
        c--;
      }
    }

    return new int[] { -1, -1 };
  }
}
