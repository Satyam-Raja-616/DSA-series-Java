package binary_search.oneD_array;

public class PeakElem {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8, 5, 1 };

    System.out.println(srch(arr));
  }

  static int srch(int[] arr) {
    int n = arr.length;

    if (n == 0)
      return -1;

    if (n == 1)
      return 0;

    if (arr[0] > arr[1])
      return 0;

    if (arr[n - 1] > arr[n - 2])
      return n - 1;

    int s = 0;
    int e = arr.length - 1;

    while (s <= e) {
      int m = s + (e - s) / 2;

      if (arr[m] > arr[m - 1] && arr[m] > arr[m + 1]) {
        return m;
      }

      if (arr[m] < arr[m + 1]) {
        s = m + 1;
      }

      else {
        e = m - 1;
      }
    }

    return -1;
  }
}
