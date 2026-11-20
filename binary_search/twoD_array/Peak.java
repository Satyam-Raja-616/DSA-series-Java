package binary_search.twoD_array;

import java.util.Arrays;

public class Peak {
  public static void main(String[] args) {
    int mat[][] = {
        { 10, 20, 15 },
        { 21, 30, 14 },
        { 7, 16, 32 }
    };

    System.out.println(Arrays.toString(find(mat)));
  }

  static int[] find(int[][] mat) {
    if (mat.length == 0 || mat[0].length == 0) {
      return new int[] { -1, -1 };
    }

    int rows = mat.length;
    int cols = mat[0].length - 1;
    int s = 0;
    int e = cols - 1;

    while (s <= e) {
      int m = s + (e - s) / 2;

      int maxR = 0;

      for (int r = 1; r < rows; r++) {
        if (mat[r][m] > mat[maxR][m]) {
          maxR = r;
        }
      }

      int l = (m > 0) ? mat[maxR][m - 1] : -1;
      int r = (m < cols - 1) ? mat[maxR][m + 1] : -1;

      if (mat[maxR][m] > l && mat[maxR][m] > r) {
        return new int[] { maxR, m };
      } 
      
      else if (l > mat[maxR][m]) {
        e = m - 1;
      } 
      
      else {
        s = m + 1;
      }
    }
    
      return new int[] { -1, -1 };
  }
}