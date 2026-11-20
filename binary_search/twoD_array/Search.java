package binary_search.twoD_array;

import java.util.Arrays;

public class Search {
  public static void main(String[] args) {
    int[][] arr = {
        { 1, 2, 3, 4 },
        { 5, 6, 7, 8 },
        { 9, 10, 11, 12 }
    };

    System.out.println(Arrays.toString(srch(arr, 8)));
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

      else if (mat[r][c] < tar) {
        r++;
      }

      else {
        c--;
      }
    }

    return new int[] { -1, -1 };
  }
}
