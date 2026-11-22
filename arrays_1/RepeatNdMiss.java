package arrays_1;

import java.util.ArrayList;
import java.util.List;

public class RepeatNdMiss {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 6, 7, 5, 7 };

    System.out.println(find(arr));
  }

  static List<Integer> find(int[] arr) {
    int i = 0;

    while (i < arr.length) {
      int c = arr[i] - 1;

      if (arr[i] != arr[c]) {
        swap(arr, i, c);
      }

      else {
        i++;
      }
    }

    List<Integer> ans = new ArrayList<>();

    for (int j = 0; j < arr.length; j++) {
      if (arr[j] != j + 1) {
        ans.add(arr[j]);
        ans.add(j + 1);
      }
    }

    return ans;
  }

  static void swap(int[] arr, int f, int s) {
    int t = arr[s];
    arr[s] = arr[f];
    arr[f] = t;
  }
}
