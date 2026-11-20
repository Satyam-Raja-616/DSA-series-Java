package binary_search.oneD_array;
import java.util.Arrays;

public class FloorNdCeil {
  public static void main(String[] args) {
    int[] arr = { 3, 4, 4, 7, 8, 10 };

    System.out.println(Arrays.toString(func(arr, 6)));
  }

  static int[] func(int[] arr, int tar) {
    int s = 0;
    int e = arr.length - 1;
    int f = -1;
    int c = -1;

    if (arr.length == 0) {
      return new int[] { -1, -1 };
    }

    while (s <= e) {
      int m = s + (e - s) / 2;

      if (tar == arr[m]) {
        return new int[] { arr[m], arr[m] };
      }

      else if (tar > arr[m]) {
        f = m;
        s = m + 1;
      }

      else {
        c = m;
        e = m - 1;
      }
    }

    return new int[] { f, c };
  }
}
