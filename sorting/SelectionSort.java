package sorting;

import java.util.Arrays;

public class SelectionSort {
  public static void main(String[] args) {
    int[] arr = { 7, 4, 1, 5, 3 };
    selection(arr);

    System.out.println(Arrays.toString(arr));
  }

  static void selection(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
      int l = arr.length - i - 1;

      int maxI = getMaxI(arr, 0, l);
      swap(arr, maxI, l);
    }
  }

  static void swap(int[] arr, int f, int s) {
    int t = arr[s];
    arr[s] = arr[f];
    arr[f] = t;
  }

  static int getMaxI(int[] arr, int s, int e) {
    int m = s;

    for (int i = 0; i <= e; i++) {
      if (arr[i] > arr[m]) {
        m = i;
      }
    }

    return m;
  }
}
