package binary_search.oneD_array;

public class Single {
  public static void main(String[] args) {
    int[] arr = { 1, 1, 2, 2, 3, 3, 4, 4, 5, 6, 6 };
    System.out.println(srch(arr));
  }

  static int srch(int[] arr) {
    int n = arr.length;

    if (n == 0)
      return -1;

    if (n == 1)
      return arr[0];

    if (arr[0] != arr[1])
      return arr[0];

    if (arr[n - 1] != arr[n - 2])
      return arr[n - 1];

    int s = 0;
    int e = arr.length - 1;

    while (s <= e) {
      int m = s + (e - s) / 2;

      if (arr[m] != arr[m - 1] && arr[m] != arr[m + 1]) {
        return arr[m];
      }

      if ((m % 2 == 1 && arr[m] == arr[m - 1]) || (m % 2 == 0 && arr[m] == arr[m + 1])) {
        s = m + 1;
      }

      else {
        e = m - 1;
      }
    }

    return -1;
  }
}
