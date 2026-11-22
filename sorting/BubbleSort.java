package sorting;

import java.util.Arrays;

public class BubbleSort {
  public static void main(String[] args) {
    int[] arr = { 7, 4, 1, 5, 3 };
    bubble(arr);

    System.out.println(Arrays.toString(arr));
  }

  static void bubble(int[] arr) {
    boolean swap;

    for (int i = 0; i < arr.length - 1; i++) {
      swap = false;

      for (int j = 1; j < arr.length - i; j++) {
        if (arr[j] < arr[j - 1]) {
          swapping(arr, j - 1, j);

          swap = true;
        }
      }

      if (!swap) {
        break;
      }
    }

  }

  static void swapping(int[] arr, int f, int s) {
    int t = arr[s];
    arr[s] = arr[f];
    arr[f] = t;
  }
}
