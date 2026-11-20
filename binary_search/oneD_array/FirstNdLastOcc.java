package binary_search.oneD_array;

import java.util.Arrays;

public class FirstNdLastOcc {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 3, 3, 3 };
    int t = 2;

    System.out.println(Arrays.toString(find(arr, t)));
  }

  static int[] find(int[] arr, int tar) {
    int f = searchOcc(arr, tar, true);

    if (f == -1) {
      return new int[] { -1, -1 };
    }

    int l = searchOcc(arr, tar, false);

    return new int[] { f, l };
  }

  static int searchOcc(int[] arr, int tar, boolean isFirst) {
    int s = 0;
    int e = arr.length - 1;
    int a = -1;

    if (arr.length == 0) {
      return -1;
    }

    while (s <= e) {
      int m = s + (e - s) / 2;

      if (arr[m] > tar) {
        e = m - 1;
      }

      else if (tar > arr[m]) {
        s = m + 1;
      }

      else {
        a = m;

        if (isFirst) {
          e = m - 1;
        }

        else {
          s = m + 1;
        }
      }
    }

    return a;
  }
}

