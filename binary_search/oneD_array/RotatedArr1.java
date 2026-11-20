package binary_search.oneD_array;

public class RotatedArr1 {
  public static void main(String[] args) {

    int[] arr = { 4, 5, 6, 7, 0, 1, 2 };
    int t = 0;

    System.out.println(search(arr, t));

  }

  static int search(int[] arr, int tar) {

    if (arr.length == 0) {
      return -1;
    }

    int s = 0;
    int e = arr.length - 1;

    while (s <= e) {
      int m = s + (e - s) / 2;

      if (arr[m] == tar) {
        return m;
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
            e = e -1;
          }
        }
      }
    return -1;
  }
}
