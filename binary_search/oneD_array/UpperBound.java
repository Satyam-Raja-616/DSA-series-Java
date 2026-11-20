package binary_search.oneD_array;

public class UpperBound {
  public static void main(String[] args) {
    int[] arr = { 1, 2, 2, 3, 3, 3 };
    int t = 3;

    System.out.println(searchUpper(arr, t));
  }

  static int searchUpper(int[] arr, int tar) {
    int s = 0;
    int e = arr.length - 1;
    int a = -1;

    if (arr.length == 0) {
      return -1;
    }

    while (s <= e) {
      int m = s + (e - s) / 2;

      if (tar >= arr[m]) {
        a = m;

        s = m + 1;
      }

      else if (tar < arr[m]) {
        e = e - 1;
      }
    }
    return a;
  }
}
