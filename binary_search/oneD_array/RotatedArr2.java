package binary_search.oneD_array;

public class RotatedArr2 {
  public static void main(String[] args) {

    int[] arr = { 7, 8, 1, 2, 3, 3, 3, 4, 5, 6 };
    int t = 5;

    System.out.println(search(arr, t));

  }

  static boolean search(int[] arr, int tar) {

    if (arr.length == 0) {
      return false;
    }

    int s = 0;
    int e = arr.length - 1;

    while (s <= e) {
      int m = s + (e - s) / 2;

      if (arr[m] == tar) {
        return true;
      }

      if (arr[s] == arr[m] && arr[m] == arr[e]) {
        s++;
        e--;
        continue;
      }

      if (arr[s] <= arr[m]) {
        if (arr[s] <= tar && tar < arr[m]) {
          e = m - 1;
        } else {
          s = m + 1;
        }
      }

      else {
        if (arr[m] < tar && tar <= arr[e]) {
          s = s + 1;
        } else {
          e = e - 1;
        }
      }
    }
    return false;
  }
}
